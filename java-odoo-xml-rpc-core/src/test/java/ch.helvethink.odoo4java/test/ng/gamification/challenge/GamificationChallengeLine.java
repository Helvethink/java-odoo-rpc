
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

package ch.helvethink.odoo4java.test.ng.gamification.challenge;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("gamification.challenge.line")
public class GamificationChallengeLine implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private GamificationChallenge challengeIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.GamificationChallenge")
        @OdooModel("gamification.GamificationChallenge")
    
    private OdooId challengeId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String definitionSuffix;

    
    private int sequence;

    
    private String definitionFullSuffix;

    
    private GamificationGoalDefinition definitionIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.gamification.goal.GamificationGoalDefinition")
        @OdooModel("gamification.goal.GamificationGoalDefinition")
    
    private OdooId definitionId;

    
    private Object condition;

    
    private String name;

    
    private double targetGoal;

    
    private int id;

    
    private boolean isDefinitionMonetary;

    
    private Date createDate;


    public GamificationChallengeLine() {
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

    public GamificationChallenge getChallengeIdAsObject() {
        return challengeIdAsObject;
    }

    public OdooId getChallengeId() {
        return challengeId;
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

    public String getDefinitionSuffix() {
        return definitionSuffix;
    }

    public int getSequence() {
        return sequence;
    }

    public String getDefinitionFullSuffix() {
        return definitionFullSuffix;
    }

    public GamificationGoalDefinition getDefinitionIdAsObject() {
        return definitionIdAsObject;
    }

    public OdooId getDefinitionId() {
        return definitionId;
    }

    public Object getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    public double getTargetGoal() {
        return targetGoal;
    }

    public int getId() {
        return id;
    }

    public boolean getIsDefinitionMonetary() {
        return isDefinitionMonetary;
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

    public void setChallengeIdAsObject(GamificationChallenge challengeIdAsObject) {
        this.challengeIdAsObject = challengeIdAsObject;
    }

    public void setChallengeId(OdooId challengeId) {
        this.challengeId = challengeId;
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

    public void setDefinitionSuffix(String definitionSuffix) {
        this.definitionSuffix = definitionSuffix;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setDefinitionFullSuffix(String definitionFullSuffix) {
        this.definitionFullSuffix = definitionFullSuffix;
    }

    public void setDefinitionIdAsObject(GamificationGoalDefinition definitionIdAsObject) {
        this.definitionIdAsObject = definitionIdAsObject;
    }

    public void setDefinitionId(OdooId definitionId) {
        this.definitionId = definitionId;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTargetGoal(double targetGoal) {
        this.targetGoal = targetGoal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsDefinitionMonetary(boolean isDefinitionMonetary) {
        this.isDefinitionMonetary = isDefinitionMonetary;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}