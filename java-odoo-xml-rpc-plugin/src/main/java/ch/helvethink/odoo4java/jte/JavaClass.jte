@import ch.helvethink.odoo4java.generator.ClassGenerator.TemplateData
@import ch.helvethink.odoo4java.generator.FieldTemplate
@import org.codehaus.plexus.util.StringUtils
@param ch.helvethink.odoo4java.generator.ClassGenerator.TemplateData data

package ${data.packageName()};

${data.importsList()}

@OdooObject("${data.modelName()}")
public class ${data.className()} implements OdooObj {
@for(FieldTemplate field : data.fields())
    @if(field.getFieldRelation() != null)
        @FieldRelation("${field.getFieldRelation()}")
        @OdooModel("${field.getFieldModel()}")
        @JsonProperty("${field.getOriginalName()}")
        private ${field.getFieldType()} ${field.getFieldName()};
    @elseif(!field.getFieldName().endsWith("AsList") && !field.getFieldName().endsWith("AsObject"))
        @JsonProperty("${field.getOriginalName()}")
        private ${field.getFieldType()} ${field.getFieldName()};
    @else
        private ${field.getFieldType()} ${field.getFieldName()};
    @endif
@endfor

    public ${data.className()}() {
    // Constructor
    }

@for(FieldTemplate field : data.fields())
    public ${field.getFieldType()} get${StringUtils.capitalise(field.getFieldName())}() {
        return ${field.getFieldName()};
    }
@endfor

@for(FieldTemplate field : data.fields())
    public void set${StringUtils.capitalise(field.getFieldName())}(${field.getFieldType()} ${field.getFieldName()}) {
        this.${field.getFieldName()} = ${field.getFieldName()};
    }
@endfor


}