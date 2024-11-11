
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

package ch.helvethink.odoo4java.test.ng.onboarding.onboarding;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.onboarding.Onboarding;
import ch.helvethink.odoo4java.test.ng.onboarding.progress.OnboardingProgressStep;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("onboarding.onboarding.step")
public class OnboardingOnboardingStep implements OdooObj {

    
    private Date writeDate;

    
    private String stepImageAlt;

    
    private String panelStepOpenActionName;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private String doneIcon;

    
    private String description;

    
    private String title;

    
    private List<OnboardingProgressStep> progressIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.progress.OnboardingProgressStep")
        @OdooModel("onboarding.progress.OnboardingProgressStep")
    
    private List<Integer> progressIds;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private OnboardingProgressStep currentProgressStepIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.progress.OnboardingProgressStep")
        @OdooModel("onboarding.progress.OnboardingProgressStep")
    
    private OdooId currentProgressStepId;

    
    private Object stepImage;

    
    private String stepImageFilename;

    
    private int sequence;

    
    private List<Onboarding> onboardingIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.Onboarding")
        @OdooModel("onboarding.Onboarding")
    
    private List<Integer> onboardingIds;

    
    private String buttonText;

    
    private int id;

    
    private Date createDate;

    
    private Object currentStepState;

    
    private boolean isIsPerCompany;

    
    private String doneText;


    public OnboardingOnboardingStep() {
    // Constructor
    }


    public Date getWriteDate() {
        return writeDate;
    }

    public String getStepImageAlt() {
        return stepImageAlt;
    }

    public String getPanelStepOpenActionName() {
        return panelStepOpenActionName;
    }

    public ResUsers getWriteUidAsObject() {
        return writeUidAsObject;
    }

    public OdooId getWriteUid() {
        return writeUid;
    }

    public String getDoneIcon() {
        return doneIcon;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public List<OnboardingProgressStep> getProgressIdsAsList() {
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

    public OnboardingProgressStep getCurrentProgressStepIdAsObject() {
        return currentProgressStepIdAsObject;
    }

    public OdooId getCurrentProgressStepId() {
        return currentProgressStepId;
    }

    public Object getStepImage() {
        return stepImage;
    }

    public String getStepImageFilename() {
        return stepImageFilename;
    }

    public int getSequence() {
        return sequence;
    }

    public List<Onboarding> getOnboardingIdsAsList() {
        return onboardingIdsAsList;
    }

    public List<Integer> getOnboardingIds() {
        return onboardingIds;
    }

    public String getButtonText() {
        return buttonText;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getCurrentStepState() {
        return currentStepState;
    }

    public boolean getIsIsPerCompany() {
        return isIsPerCompany;
    }

    public String getDoneText() {
        return doneText;
    }



    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public void setStepImageAlt(String stepImageAlt) {
        this.stepImageAlt = stepImageAlt;
    }

    public void setPanelStepOpenActionName(String panelStepOpenActionName) {
        this.panelStepOpenActionName = panelStepOpenActionName;
    }

    public void setWriteUidAsObject(ResUsers writeUidAsObject) {
        this.writeUidAsObject = writeUidAsObject;
    }

    public void setWriteUid(OdooId writeUid) {
        this.writeUid = writeUid;
    }

    public void setDoneIcon(String doneIcon) {
        this.doneIcon = doneIcon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProgressIdsAsList(List<OnboardingProgressStep> progressIdsAsList) {
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

    public void setCurrentProgressStepIdAsObject(OnboardingProgressStep currentProgressStepIdAsObject) {
        this.currentProgressStepIdAsObject = currentProgressStepIdAsObject;
    }

    public void setCurrentProgressStepId(OdooId currentProgressStepId) {
        this.currentProgressStepId = currentProgressStepId;
    }

    public void setStepImage(Object stepImage) {
        this.stepImage = stepImage;
    }

    public void setStepImageFilename(String stepImageFilename) {
        this.stepImageFilename = stepImageFilename;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setOnboardingIdsAsList(List<Onboarding> onboardingIdsAsList) {
        this.onboardingIdsAsList = onboardingIdsAsList;
    }

    public void setOnboardingIds(List<Integer> onboardingIds) {
        this.onboardingIds = onboardingIds;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCurrentStepState(Object currentStepState) {
        this.currentStepState = currentStepState;
    }

    public void setIsIsPerCompany(boolean isIsPerCompany) {
        this.isIsPerCompany = isIsPerCompany;
    }

    public void setDoneText(String doneText) {
        this.doneText = doneText;
    }



}