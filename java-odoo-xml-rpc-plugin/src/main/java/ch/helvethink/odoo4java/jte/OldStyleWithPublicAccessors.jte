@import ch.helvethink.odoo4java.generator.ClassGenerator.TemplateData
@import ch.helvethink.odoo4java.generator.FieldTemplate
@import org.codehaus.plexus.util.StringUtils
@param ch.helvethink.odoo4java.generator.ClassGenerator.TemplateData data

package ${data.packageName()};

${data.importsList()};

@OdooObject(${data.modelName()})
public class ${data.className()} implements OdooObj {
@for(FieldTemplate field : data.fields())
    @if(field.getFieldRelation() != null)
    @FieldRelation(${field.getFieldRelation()})
    @OdooModel(${field.getFieldModel()})
    @endif
    public ${field.getFieldType()} ${field.getFieldName()};
@endfor

    public ${data.className()}() {
        // Constructor
    }

}