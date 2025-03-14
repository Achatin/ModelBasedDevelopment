package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class EcommerceGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }

  public CharSequence productContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div key={id.toString()}>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<img alt={description} className=\'bg-gray-100 w-60 h-60 object-cover rounded-sm\' src=\"https://www.freeiconspng.com/thumbs/gummy-bear-png/blue-gummy-bear-png-0.png\" />");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div className=\'mt-3\'>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div className=\'flex justify-between mb-2\'>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<p className=\'text-lg font-semibold\'>{title}</p>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<p className=\'text-lg font-semibold\'>{price.currency} {price.value}</p>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<p className=\'text-sm text-gray-500\'>{description}</p>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
}
