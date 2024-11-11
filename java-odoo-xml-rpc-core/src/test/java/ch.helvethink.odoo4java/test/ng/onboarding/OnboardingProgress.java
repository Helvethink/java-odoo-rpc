
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

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.res.ResCompany;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.onboarding.Onboarding;
import ch.helvethink.odoo4java.test.ng.onboarding.progress.OnboardingProgressStep;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("onboarding.progress")
public class OnboardingProgress implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private boolean isIsOnboardingClosed;

    
    private ResCompany companyIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResCompany")
        @OdooModel("res.ResCompany")
    
    private OdooId companyId;

    
    private Onboarding onboardingIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.Onboarding")
        @OdooModel("onboarding.Onboarding")
    
    private OdooId onboardingId;

    
    private List<OnboardingProgressStep> progressStepIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.onboarding.progress.OnboardingProgressStep")
        @OdooModel("onboarding.progress.OnboardingProgressStep")
    
    private List<Integer> progressStepIds;

    
    private int id;

    
    private Object onboardingState;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Date createDate;


    public OnboardingProgress() {
    // Constructor
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

    public boolean getIsIsOnboardingClosed() {
        return isIsOnboardingClosed;
    }

    public ResCompany getCompanyIdAsObject() {
        return companyIdAsObject;
    }

    public OdooId getCompanyId() {
        return companyId;
    }

    public Onboarding getOnboardingIdAsObject() {
        return onboardingIdAsObject;
    }

    public OdooId getOnboardingId() {
        return onboardingId;
    }

    public List<OnboardingProgressStep> getProgressStepIdsAsList() {
        return progressStepIdsAsList;
    }

    public List<Integer> getProgressStepIds() {
        return progressStepIds;
    }

    public int getId() {
        return id;
    }

    public Object getOnboardingState() {
        return onboardingState;
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

    public Date getCreateDate() {
        return createDate;
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

    public void setIsIsOnboardingClosed(boolean isIsOnboardingClosed) {
        this.isIsOnboardingClosed = isIsOnboardingClosed;
    }

    public void setCompanyIdAsObject(ResCompany companyIdAsObject) {
        this.companyIdAsObject = companyIdAsObject;
    }

    public void setCompanyId(OdooId companyId) {
        this.companyId = companyId;
    }

    public void setOnboardingIdAsObject(Onboarding onboardingIdAsObject) {
        this.onboardingIdAsObject = onboardingIdAsObject;
    }

    public void setOnboardingId(OdooId onboardingId) {
        this.onboardingId = onboardingId;
    }

    public void setProgressStepIdsAsList(List<OnboardingProgressStep> progressStepIdsAsList) {
        this.progressStepIdsAsList = progressStepIdsAsList;
    }

    public void setProgressStepIds(List<Integer> progressStepIds) {
        this.progressStepIds = progressStepIds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOnboardingState(Object onboardingState) {
        this.onboardingState = onboardingState;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}