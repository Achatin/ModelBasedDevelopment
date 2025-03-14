package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class EcommerceGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def productContent()'''
	<div key={id.toString()}>
	  <img alt={description} className='bg-gray-100 w-60 h-60 object-cover rounded-sm' src="https://www.freeiconspng.com/thumbs/gummy-bear-png/blue-gummy-bear-png-0.png" />
      <div className='mt-3'>
        <div className='flex justify-between mb-2'>
          <p className='text-lg font-semibold'>{title}</p>
          <p className='text-lg font-semibold'>{price.currency} {price.value}</p>
        </div>
        <p className='text-sm text-gray-500'>{description}</p>
      </div>
    </div>
	'''
	
}