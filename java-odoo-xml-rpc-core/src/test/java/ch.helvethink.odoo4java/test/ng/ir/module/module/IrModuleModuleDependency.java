
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

package ch.helvethink.odoo4java.test.ng.ir.module.module;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.ir.module.Module;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;;

@OdooObject("ir.module.module.dependency")
public class IrModuleModuleDependency implements OdooObj {

    
    private Module moduleIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId moduleId;

    
    private boolean isAutoInstallRequired;

    
    private String name;

    
    private Object state;

    
    private int id;

    
    private Module dependIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.ir.module.Module")
        @OdooModel("ir.module.Module")
    
    private OdooId dependId;

    
    private String displayName;


    public IrModuleModuleDependency() {
    // Constructor
    }


    public Module getModuleIdAsObject() {
        return moduleIdAsObject;
    }

    public OdooId getModuleId() {
        return moduleId;
    }

    public boolean getIsAutoInstallRequired() {
        return isAutoInstallRequired;
    }

    public String getName() {
        return name;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Module getDependIdAsObject() {
        return dependIdAsObject;
    }

    public OdooId getDependId() {
        return dependId;
    }

    public String getDisplayName() {
        return displayName;
    }



    public void setModuleIdAsObject(Module moduleIdAsObject) {
        this.moduleIdAsObject = moduleIdAsObject;
    }

    public void setModuleId(OdooId moduleId) {
        this.moduleId = moduleId;
    }

    public void setIsAutoInstallRequired(boolean isAutoInstallRequired) {
        this.isAutoInstallRequired = isAutoInstallRequired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDependIdAsObject(Module dependIdAsObject) {
        this.dependIdAsObject = dependIdAsObject;
    }

    public void setDependId(OdooId dependId) {
        this.dependId = dependId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }



}