
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

package ch.helvethink.odoo4java.test.ng.slide;

import java.util.List;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObject;
import ch.helvethink.odoo4java.test.ng.slide.SlideAnswer;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.test.ng.slide.Slide;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.models.OdooModel;
import ch.helvethink.odoo4java.test.ng.res.ResUsers;
import java.util.Date;;

@OdooObject("slide.question")
public class SlideQuestion implements OdooObj {

    
    private Date writeDate;

    
    private ResUsers writeUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId writeUid;

    
    private List<SlideAnswer> answerIdsAsList;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.SlideAnswer")
        @OdooModel("slide.SlideAnswer")
    
    private List<Integer> answerIds;

    
    private String question;

    
    private int doneCount;

    
    private int attemptsCount;

    
    private Slide slideIdAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.slide.Slide")
        @OdooModel("slide.Slide")
    
    private OdooId slideId;

    
    private String displayName;

    
    private ResUsers createUidAsObject;

    
        @FieldRelation("ch.helvethink.odoo4java.test.ng.res.ResUsers")
        @OdooModel("res.ResUsers")
    
    private OdooId createUid;

    
    private String answersValidationError;

    
    private int sequence;

    
    private int id;

    
    private double attemptsAvg;

    
    private Date createDate;


    public SlideQuestion() {
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

    public List<SlideAnswer> getAnswerIdsAsList() {
        return answerIdsAsList;
    }

    public List<Integer> getAnswerIds() {
        return answerIds;
    }

    public String getQuestion() {
        return question;
    }

    public int getDoneCount() {
        return doneCount;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public Slide getSlideIdAsObject() {
        return slideIdAsObject;
    }

    public OdooId getSlideId() {
        return slideId;
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

    public String getAnswersValidationError() {
        return answersValidationError;
    }

    public int getSequence() {
        return sequence;
    }

    public int getId() {
        return id;
    }

    public double getAttemptsAvg() {
        return attemptsAvg;
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

    public void setAnswerIdsAsList(List<SlideAnswer> answerIdsAsList) {
        this.answerIdsAsList = answerIdsAsList;
    }

    public void setAnswerIds(List<Integer> answerIds) {
        this.answerIds = answerIds;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setDoneCount(int doneCount) {
        this.doneCount = doneCount;
    }

    public void setAttemptsCount(int attemptsCount) {
        this.attemptsCount = attemptsCount;
    }

    public void setSlideIdAsObject(Slide slideIdAsObject) {
        this.slideIdAsObject = slideIdAsObject;
    }

    public void setSlideId(OdooId slideId) {
        this.slideId = slideId;
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

    public void setAnswersValidationError(String answersValidationError) {
        this.answersValidationError = answersValidationError;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAttemptsAvg(double attemptsAvg) {
        this.attemptsAvg = attemptsAvg;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



}