# Model Driven Website Generator

Made using Xtext. Helps generate lots of boilerplate code for full-stack NextJS website. All thanks to simple DSL.

**Expectations Checklist**
- Metamodel and Grammar design ✅
- Code generation ✅
- Left recursion ✅
  - math expression conditions, e.g. if value >= 0.01
- Scope, name resolution ✅
  - backward reference - component needs to be first defined, before it can be used as a type
- Model is part of dev process ✅


Example use of DSL:
```
component Price {
  attribute value as number
  attribute currency as string
  attribute discount as number
  
  if value >= 0.01
}

component Product {
  attribute id as number
  attribute title as string
  attribute description as string
  attribute price as Price
}
```

## What it generates

### Models
Can be used anywhere in the code. Ensures type safety and ease of use.

*/src/models.ts*
```ts
export interface Price {
	value: number;
	currency: string;
	discount: number;
}

export interface Product {
	id: number;
	title: string;
	description: string;
	price: Price;
}
```

### Components
Building blocks of the website. Uses previously mentioned generated models. Empty skeleton without styling - improved with an individual extension.

*/src/components/product.tsx*
```tsx
import { FC } from 'react'
import { Price } from "@/models"

const PriceComponent: FC<Price> = ({ value, currency, discount }) => {
  return (
      <div className='price'>
        <div className='value'>
          {value}
        </div>
        <div className='currency'>
          {currency}
        </div>
        <div className='discount'>
          {discount}
        </div>
      </div>
    )
}

export default PriceComponent
```

### NextJS API
API endpoints of a NextJS website. Usually used for fetching from DB. Our implementation has mockData variable - further improved with Prisma DB in individual extension.

*/src/app/api/product/route.ts*
```ts
import { NextResponse } from "next/server"
import { Product } from "@/models"

const mockData: Product[] = [];

// GET all entities
export async function GET() {
    return NextResponse.json(mockData, { status: 200 });
}

// POST (Create new entity)
export async function POST(req: Request) {
    const newItem: Product = await req.json();
    mockData.push(newItem);
    return NextResponse.json(newItem, { status: 201 });
}

// GET single entity by ID
export async function GET_BY_ID(req: Request, { params }: { params: { id: string } }) {
    const item = mockData.find(e => e.id.toString() === params.id);
    if (!item) return NextResponse.json({ message: "Not Found" }, { status: 404 });
    return NextResponse.json(item, { status: 200 });
}

// PUT (Update entity by ID)
export async function PUT(req: Request, { params }: { params: { id: string } }) {
    const index = mockData.findIndex(e => e.id.toString() === params.id);
    if (index === -1) return NextResponse.json({ message: "Not Found" }, { status: 404 });

    const updatedItem: Product = await req.json();
    mockData[index] = { ...mockData[index], ...updatedItem };

    return NextResponse.json(mockData[index], { status: 200 });
}

// DELETE entity by ID
export async function DELETE(req: Request, { params }: { params: { id: string } }) {
    const index = mockData.findIndex(e => e.id.toString() === params.id);
    if (index === -1) return NextResponse.json({ message: "Not Found" }, { status: 404 });

    mockData.splice(index, 1);
    return NextResponse.json({ message: "Deleted" }, { status: 204 });
}

```

### Usage
These all can now be easily used to build pages right away. Everything important is handled by our DSL code generation.

Example page built with all the generated features:
```tsx
'use client'

import ProductComponent from "@/components/product";
import { Product } from "@/models";
import { useEffect, useState } from "react";

export default function Home() {
  const [products, setProducts] = useState<Product[]>();

  useEffect(() => {
    const getProducts = async () => {
      const res = await fetch('/api/product', { cache: "no-store" });
      setProducts(await res.json());
    }

    getProducts();
  }, [])

  if (!products) {
    return <p>LOADING...</p>
  }

  return (
    <div className="bg-white text-black grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20 font-[family-name:var(--font-geist-sans)]">
      <main className="flex flex-col gap-8 row-start-2 items-center sm:items-start">
        <div className="grid grid-cols-3 space-x-8">
          {products.map((product: Product) => (
          <ProductComponent
            key={product.id}
            id={product.id} 
            title={product.title} 
            description={product.description} 
            price={product.price}
          />
          ))}
        </div>
      </main>
      <footer className="row-start-3 flex gap-6 flex-wrap items-center justify-center">
        Candy Shop
      </footer>
    </div>
  );
}

```

![Screenshot from 2025-03-19 08-05-55](https://github.com/user-attachments/assets/00524046-7160-43c8-a48f-cc3dd1c06fd3)

