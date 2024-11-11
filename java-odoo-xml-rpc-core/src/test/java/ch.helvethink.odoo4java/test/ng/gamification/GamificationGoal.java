
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

package ch.helvethink.odoo4java.test.ng.gamification;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge;
import ch.helvethink.odoo4java.test.ng.gamification.challenge.GamificationChallengeLine;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("gamification.goal")
public class GamificationGoal implements OdooObj {

    
    private Object endDate;

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private GamificationChallenge challengeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge")
        @OdooModel("gamification.GamificationChallenge")
    
    private OdooId challengeId;

    
    private double completeness;

    
    private GamificationChallengeLine lineIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.challenge.GamificationChallengeLine")
        @OdooModel("gamification.challenge.GamificationChallengeLine")
    
    private OdooId lineId;

    
    private String definitionSuffix;

    
    private GamificationGoalDefinition definitionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition")
        @OdooModel("gamification.goal.GamificationGoalDefinition")
    
    private OdooId definitionId;

    
    private double current;

    
    private Object lastUpdate;

    
    private boolean isToUpdate;

    
    private Object state;

    
    private int id;

    
    private Object computationMode;

    
    private Date createDate;

    
    private Object startDate;

    
    private int remindUpdateDelay;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private Object definitionDescription;

    
    private Object definitionCondition;

    
    private ResUsers userIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId userId;

    
    private boolean isClosed;

    
    private double targetGoal;

    
    private Object definitionDisplay;


    public GamificationGoal() {
    // Constructor
    }


    public Object getEndDate() {
        return endDate;
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

    public GamificationChallenge getChallengeIdAsObject() {
        return challengeIdAsObject;
    }

    public OdooId getChallengeId() {
        return challengeId;
    }

    public double getCompleteness() {
        return completeness;
    }

    public GamificationChallengeLine getLineIdAsObject() {
        return lineIdAsObject;
    }

    public OdooId getLineId() {
        return lineId;
    }

    public String getDefinitionSuffix() {
        return definitionSuffix;
    }

    public GamificationGoalDefinition getDefinitionIdAsObject() {
        return definitionIdAsObject;
    }

    public OdooId getDefinitionId() {
        return definitionId;
    }

    public double getCurrent() {
        return current;
    }

    public Object getLastUpdate() {
        return lastUpdate;
    }

    public boolean getIsToUpdate() {
        return isToUpdate;
    }

    public Object getState() {
        return state;
    }

    public int getId() {
        return id;
    }

    public Object getComputationMode() {
        return computationMode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Object getStartDate() {
        return startDate;
    }

    public int getRemindUpdateDelay() {
        return remindUpdateDelay;
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

    public Object getDefinitionDescription() {
        return definitionDescription;
    }

    public Object getDefinitionCondition() {
        return definitionCondition;
    }

    public ResUsers getUserIdAsObject() {
        return userIdAsObject;
    }

    public OdooId getUserId() {
        return userId;
    }

    public boolean getIsClosed() {
        return isClosed;
    }

    public double getTargetGoal() {
        return targetGoal;
    }

    public Object getDefinitionDisplay() {
        return definitionDisplay;
    }



    public void setEndDate(Object endDate) {
        this.endDate = endDate;
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

    public void setChallengeIdAsObject(GamificationChallenge challengeIdAsObject) {
        this.challengeIdAsObject = challengeIdAsObject;
    }

    public void setChallengeId(OdooId challengeId) {
        this.challengeId = challengeId;
    }

    public void setCompleteness(double completeness) {
        this.completeness = completeness;
    }

    public void setLineIdAsObject(GamificationChallengeLine lineIdAsObject) {
        this.lineIdAsObject = lineIdAsObject;
    }

    public void setLineId(OdooId lineId) {
        this.lineId = lineId;
    }

    public void setDefinitionSuffix(String definitionSuffix) {
        this.definitionSuffix = definitionSuffix;
    }

    public void setDefinitionIdAsObject(GamificationGoalDefinition definitionIdAsObject) {
        this.definitionIdAsObject = definitionIdAsObject;
    }

    public void setDefinitionId(OdooId definitionId) {
        this.definitionId = definitionId;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public void setLastUpdate(Object lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setIsToUpdate(boolean isToUpdate) {
        this.isToUpdate = isToUpdate;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComputationMode(Object computationMode) {
        this.computationMode = computationMode;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public void setRemindUpdateDelay(int remindUpdateDelay) {
        this.remindUpdateDelay = remindUpdateDelay;
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

    public void setDefinitionDescription(Object definitionDescription) {
        this.definitionDescription = definitionDescription;
    }

    public void setDefinitionCondition(Object definitionCondition) {
        this.definitionCondition = definitionCondition;
    }

    public void setUserIdAsObject(ResUsers userIdAsObject) {
        this.userIdAsObject = userIdAsObject;
    }

    public void setUserId(OdooId userId) {
        this.userId = userId;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void setTargetGoal(double targetGoal) {
        this.targetGoal = targetGoal;
    }

    public void setDefinitionDisplay(Object definitionDisplay) {
        this.definitionDisplay = definitionDisplay;
    }



}