/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.mydsl.pMDSL.Attribute;
import org.xtext.example.mydsl.pMDSL.Entity;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PMDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("/candy-shop/src/models.ts", this.models(Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class)));
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity e : _filter) {
      {
        String _firstLower = StringExtensions.toFirstLower(e.getName());
        String _plus = ("/candy-shop/src/app/api/" + _firstLower);
        String _plus_1 = (_plus + "/route.ts");
        fsa.generateFile(_plus_1, this.apiRoutes(e));
        String _firstLower_1 = StringExtensions.toFirstLower(e.getName());
        String _plus_2 = ("/candy-shop/src/components/" + _firstLower_1);
        String _plus_3 = (_plus_2 + ".tsx");
        fsa.generateFile(_plus_3, this.components(e));
      }
    }
  }

  public CharSequence models(final Iterable<Entity> entities) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Entity entity : entities) {
        _builder.append("export interface ");
        String _name = entity.getName();
        _builder.append(_name);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          EList<Attribute> _attributes = entity.getAttributes();
          for(final Attribute attribute : _attributes) {
            {
              String _primitive = attribute.getType().getPrimitive();
              boolean _tripleNotEquals = (_primitive != null);
              if (_tripleNotEquals) {
                _builder.append("\t");
                String _name_1 = attribute.getName();
                _builder.append(_name_1, "\t");
                _builder.append(": ");
                String _primitive_1 = attribute.getType().getPrimitive();
                _builder.append(_primitive_1, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                Entity _entity = attribute.getType().getEntity();
                boolean _tripleNotEquals_1 = (_entity != null);
                if (_tripleNotEquals_1) {
                  _builder.append("\t");
                  String _name_2 = attribute.getName();
                  _builder.append(_name_2, "\t");
                  _builder.append(": ");
                  String _name_3 = attribute.getType().getEntity().getName();
                  _builder.append(_name_3, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  String _name_4 = attribute.getName();
                  _builder.append(_name_4, "\t");
                  _builder.append(": any;");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }

  public CharSequence apiRoutes(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { NextResponse } from \"next/server\"");
    _builder.newLine();
    _builder.append("import { ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append(" } from \"@/models\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("const mockData: ");
    String _name_1 = entity.getName();
    _builder.append(_name_1);
    _builder.append("[] = [];");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// GET all entities");
    _builder.newLine();
    _builder.append("export async function GET() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return NextResponse.json(mockData, { status: 200 });");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// POST (Create new entity)");
    _builder.newLine();
    _builder.append("export async function POST(req: Request) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const newItem: ");
    String _name_2 = entity.getName();
    _builder.append(_name_2, "    ");
    _builder.append(" = await req.json();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("mockData.push(newItem);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return NextResponse.json(newItem, { status: 201 });");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// GET single entity by ID");
    _builder.newLine();
    _builder.append("export async function GET_BY_ID(req: Request, { params }: { params: { id: string } }) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const item = mockData.find(e => e.id.toString() === params.id);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (!item) return NextResponse.json({ message: \"Not Found\" }, { status: 404 });");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return NextResponse.json(item, { status: 200 });");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// PUT (Update entity by ID)");
    _builder.newLine();
    _builder.append("export async function PUT(req: Request, { params }: { params: { id: string } }) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const index = mockData.findIndex(e => e.id.toString() === params.id);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (index === -1) return NextResponse.json({ message: \"Not Found\" }, { status: 404 });");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const updatedItem: ");
    String _name_3 = entity.getName();
    _builder.append(_name_3, "    ");
    _builder.append(" = await req.json();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("mockData[index] = { ...mockData[index], ...updatedItem };");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return NextResponse.json(mockData[index], { status: 200 });");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// DELETE entity by ID");
    _builder.newLine();
    _builder.append("export async function DELETE(req: Request, { params }: { params: { id: string } }) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("const index = mockData.findIndex(e => e.id.toString() === params.id);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (index === -1) return NextResponse.json({ message: \"Not Found\" }, { status: 404 });");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("mockData.splice(index, 1);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return NextResponse.json({ message: \"Deleted\" }, { status: 204 });");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence components(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import { FC } from \'react\'");
    _builder.newLine();
    _builder.append("import { ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append(" } from \"@/models\"");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribute> _attributes = entity.getAttributes();
      for(final Attribute attribute : _attributes) {
        {
          Entity _entity = attribute.getType().getEntity();
          boolean _tripleNotEquals = (_entity != null);
          if (_tripleNotEquals) {
            _builder.append("import ");
            String _firstUpper = StringExtensions.toFirstUpper(attribute.getName());
            _builder.append(_firstUpper);
            _builder.append("Component from \'./");
            String _name_1 = attribute.getName();
            _builder.append(_name_1);
            _builder.append("\'");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("const ");
    String _name_2 = entity.getName();
    _builder.append(_name_2);
    _builder.append("Component: FC<");
    String _name_3 = entity.getName();
    _builder.append(_name_3);
    _builder.append("> = ({ ");
    {
      EList<Attribute> _attributes_1 = entity.getAttributes();
      boolean _hasElements = false;
      for(final Attribute attribute_1 : _attributes_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_4 = attribute_1.getName();
        _builder.append(_name_4);
      }
    }
    _builder.append(" }) => {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return (");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div>");
    _builder.newLine();
    {
      EList<Attribute> _attributes_2 = entity.getAttributes();
      for(final Attribute attribute_2 : _attributes_2) {
        {
          Entity _entity_1 = attribute_2.getType().getEntity();
          boolean _tripleNotEquals_1 = (_entity_1 != null);
          if (_tripleNotEquals_1) {
            _builder.append("        ");
            _builder.append("<div>");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("  ");
            _builder.append("<strong>");
            String _name_5 = attribute_2.getName();
            _builder.append(_name_5, "          ");
            _builder.append(":</strong>");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("  ");
            _builder.append("<");
            String _firstUpper_1 = StringExtensions.toFirstUpper(attribute_2.getName());
            _builder.append(_firstUpper_1, "          ");
            _builder.append("Component ");
            {
              EList<Attribute> _attributes_3 = attribute_2.getType().getEntity().getAttributes();
              boolean _hasElements_1 = false;
              for(final Attribute subAttr : _attributes_3) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(" ", "          ");
                }
                String _name_6 = subAttr.getName();
                _builder.append(_name_6, "          ");
                _builder.append("={");
                String _name_7 = attribute_2.getName();
                _builder.append(_name_7, "          ");
                _builder.append(".");
                String _name_8 = subAttr.getName();
                _builder.append(_name_8, "          ");
                _builder.append("}");
              }
            }
            _builder.append("/>");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("</div>");
            _builder.newLine();
          } else {
            _builder.append("        ");
            _builder.append("<div>");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("  ");
            _builder.append("<strong>");
            String _name_9 = attribute_2.getName();
            _builder.append(_name_9, "          ");
            _builder.append(":</strong> {");
            String _name_10 = attribute_2.getName();
            _builder.append(_name_10, "          ");
            _builder.append("}");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("export default ");
    String _name_11 = entity.getName();
    _builder.append(_name_11);
    _builder.append("Component");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
