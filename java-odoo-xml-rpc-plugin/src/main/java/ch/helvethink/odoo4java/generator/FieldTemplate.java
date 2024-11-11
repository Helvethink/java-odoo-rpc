/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.generator;

public class FieldTemplate {

    private String fieldRelation;

    private String fieldModel;

    private String fieldName;

    private String fieldType;

    private boolean isOdooId;

    private boolean isOdooListIds;

    private String originalName;

    public FieldTemplate(final String originalName, final String fieldName, final String fieldType) {
        this.originalName = originalName;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    public FieldTemplate(final FieldTemplate fromField) {
        if(fromField.isOdooId) {
            this.fieldName = fromField.fieldName + "AsObject";
            this.fieldType = fromField.getFieldRelation().substring(fromField.getFieldRelation().lastIndexOf(".") + 1);
        } else if (fromField.isOdooListIds) {
            this.fieldName = fromField.fieldName + "AsList";
            this.fieldType = "List<" + fromField.getFieldRelation().substring(fromField.getFieldRelation().lastIndexOf(".") + 1) + ">";
        } else {
            throw new RuntimeException("This case should never happen");
        }
    }

    public String getFieldRelation() {
        return fieldRelation;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(final String fieldType) {
        this.fieldType = fieldType;
    }

    public boolean isOdooId() {
        return isOdooId;
    }

    public void setOdooId(final boolean odooId) {
        isOdooId = odooId;
    }

    public boolean isOdooListIds() {
        return isOdooListIds;
    }

    public void setOdooListIds(final boolean odooListIds) {
        isOdooListIds = odooListIds;
    }

    public String getFieldModel() {
        return fieldModel;
    }

    public void setFieldModel(final String fieldModel) {
        this.fieldModel = fieldModel;
    }

    public void setFieldRelation(final String fieldRelation) {
        this.fieldRelation = fieldRelation;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(final String originalName) {
        this.originalName = originalName;
    }
}
