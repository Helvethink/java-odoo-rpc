
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

package ch.helvethink.odoo4java.test.ng.onboarding;

import ch.helvethink.odoo4java.test.ng.onboarding.OnboardingProgress;
import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.onboarding.onboarding.OnboardingOnboardingStep;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("onboarding.onboarding")
public class Onboarding implements OdooObj {

    
    private String textCompleted;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private OnboardingProgress currentProgressIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.OnboardingProgress")
        @OdooModel("onboarding.OnboardingProgress")
    
    private OdooId currentProgressId;

    
    private String panelCloseActionName;

    
    private String routeName;

    
    private Object currentOnboardingState;

    
    private List<OnboardingProgress> progressIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.OnboardingProgress")
        @OdooModel("onboarding.OnboardingProgress")
    
    private List<Integer> progressIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private List<OnboardingOnboardingStep> stepIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.onboarding.OnboardingOnboardingStep")
        @OdooModel("onboarding.onboarding.OnboardingOnboardingStep")
    
    private List<Integer> stepIds;

    
    private int sequence;

    
    private boolean isIsOnboardingClosed;

    
    private String name;

    
    private int id;

    
    private Date createDate;

    
    private boolean isIsPerCompany;


    public Onboarding() {
    // Constructor
    }


    public String getTextCompleted() {
        return textCompleted;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public OnboardingProgress getCurrentProgressIdAsObject() {
        return currentProgressIdAsObject;
    }

    public OdooId getCurrentProgressId() {
        return currentProgressId;
    }

    public String getPanelCloseActionName() {
        return panelCloseActionName;
    }

    public String getRouteName() {
        return routeName;
    }

    public Object getCurrentOnboardingState() {
        return currentOnboardingState;
    }

    public List<OnboardingProgress> getProgressIdsAsList() {
        return progressIdsAsList;
    }

    public List<Integer> getProgressIds() {
        return progressIds;
    }

    public String getDisplayName() {
        return displayName;
    }

    public ResUsers getCreateUidAsObject() {
        return createUidAsObject;
    }

    public OdooId getCreateUid() {
        return createUid;
    }

    public List<OnboardingOnboardingStep> getStepIdsAsList() {
        return stepIdsAsList;
    }

    public List<Integer> getStepIds() {
        return stepIds;
    }

    public int getSequence() {
        return sequence;
    }

    public boolean getIsIsOnboardingClosed() {
        return isIsOnboardingClosed;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public boolean getIsIsPerCompany() {
        return isIsPerCompany;
    }



    public void setTextCompleted(String textCompleted) {
        this.textCompleted = textCompleted;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setCurrentProgressIdAsObject(OnboardingProgress currentProgressIdAsObject) {
        this.currentProgressIdAsObject = currentProgressIdAsObject;
    }

    public void setCurrentProgressId(OdooId currentProgressId) {
        this.currentProgressId = currentProgressId;
    }

    public void setPanelCloseActionName(String panelCloseActionName) {
        this.panelCloseActionName = panelCloseActionName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setCurrentOnboardingState(Object currentOnboardingState) {
        this.currentOnboardingState = currentOnboardingState;
    }

    public void setProgressIdsAsList(List<OnboardingProgress> progressIdsAsList) {
        this.progressIdsAsList = progressIdsAsList;
    }

    public void setProgressIds(List<Integer> progressIds) {
        this.progressIds = progressIds;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCreateUidAsObject(ResUsers createUidAsObject) {
        this.createUidAsObject = createUidAsObject;
    }

    public void setCreateUid(OdooId createUid) {
        this.createUid = createUid;
    }

    public void setStepIdsAsList(List<OnboardingOnboardingStep> stepIdsAsList) {
        this.stepIdsAsList = stepIdsAsList;
    }

    public void setStepIds(List<Integer> stepIds) {
        this.stepIds = stepIds;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setIsIsOnboardingClosed(boolean isIsOnboardingClosed) {
        this.isIsOnboardingClosed = isIsOnboardingClosed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setIsIsPerCompany(boolean isIsPerCompany) {
        this.isIsPerCompany = isIsPerCompany;
    }



}