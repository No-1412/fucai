package com.fucai.service.impl;

import com.fucai.dao.FiveRedBallProbabilityMapperExt;
import com.fucai.dto.FiveRedBallProbabilityDTO;
import com.fucai.model.FiveRedBallProbability;
import com.fucai.service.FiveRedBallProbabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author liaoyubo
 * @version 1.0 2017/4/12
 * @description
 */
@Service
public class FiveRedBallProbabilityServiceImpl implements FiveRedBallProbabilityService {

    @Autowired
    private FiveRedBallProbabilityMapperExt fiveRedBallProbabilityMapperExt;

    @Override
    public List<FiveRedBallProbabilityDTO> getRedBallProbability(FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO) {
        return fiveRedBallProbabilityMapperExt.getRedBallProbability(fiveRedBallProbabilityDTO);
    }

    @Override
    public void addFiveRedBallProbability(FiveRedBallProbability fiveRedBallProbability) {
        fiveRedBallProbabilityMapperExt.insertSelective(fiveRedBallProbability);
    }

    @Override
    public void updateFiveRedBallProbability(FiveRedBallProbability fiveRedBallProbability) {
        fiveRedBallProbabilityMapperExt.updateByPrimaryKeySelective(fiveRedBallProbability);
    }

    @Override
    public String getFiveRedBallListStr() {
        String fiveRedBallListStr = "";
        StringBuffer redBallOne = new StringBuffer();
        StringBuffer redBallTwo = new StringBuffer();
        StringBuffer redBallThree = new StringBuffer();
        StringBuffer redBallFour = new StringBuffer();
        StringBuffer redBallFive = new StringBuffer();
        StringBuffer redBallSix = new StringBuffer();
        StringBuffer redBallSeven = new StringBuffer();
        StringBuffer redBallEight = new StringBuffer();
        StringBuffer redBallNine = new StringBuffer();
        StringBuffer redBallTen = new StringBuffer();
        StringBuffer redBallEleven = new StringBuffer();
        StringBuffer redBallTwelve = new StringBuffer();
        StringBuffer redBallThirteen = new StringBuffer();
        StringBuffer redBallFourteen = new StringBuffer();
        StringBuffer redBallFifteen = new StringBuffer();
        StringBuffer redBallSixteen = new StringBuffer();
        StringBuffer redBallSeventeen = new StringBuffer();
        StringBuffer redBallEighteen = new StringBuffer();
        StringBuffer redBallNineteen = new StringBuffer();
        StringBuffer redBallTwenty = new StringBuffer();
        StringBuffer redBallTwentyOne = new StringBuffer();
        StringBuffer redBallTwentyTwo = new StringBuffer();
        StringBuffer redBallTwentyThree = new StringBuffer();
        StringBuffer redBallTwentyFour = new StringBuffer();
        StringBuffer redBallTwentyFive = new StringBuffer();
        StringBuffer redBallTwentySix = new StringBuffer();
        StringBuffer redBallTwentySeven = new StringBuffer();
        StringBuffer redBallTwentyEight = new StringBuffer();
        StringBuffer redBallTwentyNine = new StringBuffer();
        StringBuffer redBallThirty = new StringBuffer();
        StringBuffer redBallThirtyOne = new StringBuffer();
        StringBuffer redBallThirtyTwo = new StringBuffer();
        StringBuffer redBallThirtyThree = new StringBuffer();
        List<FiveRedBallProbabilityDTO> fiveRedBallProbabilityDTOList = getRedBallProbability(null);
        for (FiveRedBallProbabilityDTO fiveRedBallProbabilityDTO : fiveRedBallProbabilityDTOList){
            //红球1
            if(redBallOne.length() != 0){
                redBallOne.append(",");
            }
            redBallOne.append("{");
            redBallOne.append("x:");
            redBallOne.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallOne.append(",");
            redBallOne.append("y:");
            redBallOne.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallOne.append("}");
            //红球2
            if(redBallTwo.length() != 0){
                redBallTwo.append(",");
            }
            redBallTwo.append("{");
            redBallTwo.append("x:");
            redBallTwo.append(fiveRedBallProbabilityDTO.getRedBallTwo());
            redBallTwo.append(",");
            redBallTwo.append("y:");
            redBallTwo.append(fiveRedBallProbabilityDTO.getRedBallTwo());
            redBallTwo.append("}");
            //红球3
            if(redBallThree.length() != 0){
                redBallThree.append(",");
            }
            redBallThree.append("{");
            redBallThree.append("x:");
            redBallThree.append(fiveRedBallProbabilityDTO.getRedBallThree());
            redBallThree.append(",");
            redBallThree.append("y:");
            redBallThree.append(fiveRedBallProbabilityDTO.getRedBallThree());
            redBallThree.append("}");
            //红球4
            if(redBallFour.length() != 0){
                redBallFour.append(",");
            }
            redBallFour.append("{");
            redBallFour.append("x:");
            redBallFour.append(fiveRedBallProbabilityDTO.getRedBallFour());
            redBallFour.append(",");
            redBallFour.append("y:");
            redBallFour.append(fiveRedBallProbabilityDTO.getRedBallFour());
            redBallFour.append("}");
            //红球5
            if(redBallFive.length() != 0){
                redBallFive.append(",");
            }
            redBallFive.append("{");
            redBallFive.append("x:");
            redBallFive.append(fiveRedBallProbabilityDTO.getRedBallFive());
            redBallFive.append(",");
            redBallFive.append("y:");
            redBallFive.append(fiveRedBallProbabilityDTO.getRedBallFive());
            redBallFive.append("}");
            //红球6
            if(redBallSix.length() != 0){
                redBallSix.append(",");
            }
            redBallSix.append("{");
            redBallSix.append("x:");
            redBallSix.append(fiveRedBallProbabilityDTO.getRedBallSix());
            redBallSix.append(",");
            redBallSix.append("y:");
            redBallSix.append(fiveRedBallProbabilityDTO.getRedBallSix());
            redBallSix.append("}");
            //红球7
            if(redBallSeven.length() != 0){
                redBallSeven.append(",");
            }
            redBallSeven.append("{");
            redBallSeven.append("x:");
            redBallSeven.append(fiveRedBallProbabilityDTO.getRedBallSeven());
            redBallSeven.append(",");
            redBallSeven.append("y:");
            redBallSeven.append(fiveRedBallProbabilityDTO.getRedBallSeven());
            redBallSeven.append("}");
            //红球8
            if(redBallEight.length() != 0){
                redBallEight.append(",");
            }
            redBallEight.append("{");
            redBallEight.append("x:");
            redBallEight.append(fiveRedBallProbabilityDTO.getRedBallEight());
            redBallEight.append(",");
            redBallEight.append("y:");
            redBallEight.append(fiveRedBallProbabilityDTO.getRedBallEight());
            redBallEight.append("}");
            //红球9
            if(redBallNine.length() != 0){
                redBallNine.append(",");
            }
            redBallNine.append("{");
            redBallNine.append("x:");
            redBallNine.append(fiveRedBallProbabilityDTO.getRedBallNine());
            redBallNine.append(",");
            redBallNine.append("y:");
            redBallNine.append(fiveRedBallProbabilityDTO.getRedBallNine());
            redBallNine.append("}");
            //红球10
            if(redBallTen.length() != 0){
                redBallTen.append(",");
            }
            redBallTen.append("{");
            redBallTen.append("x:");
            redBallTen.append(fiveRedBallProbabilityDTO.getRedBallTen());
            redBallTen.append(",");
            redBallTen.append("y:");
            redBallTen.append(fiveRedBallProbabilityDTO.getRedBallTen());
            redBallTen.append("}");
            //红球11
            if(redBallEleven.length() != 0){
                redBallEleven.append(",");
            }
            redBallEleven.append("{");
            redBallEleven.append("x:");
            redBallEleven.append(fiveRedBallProbabilityDTO.getRedBallEleven());
            redBallEleven.append(",");
            redBallEleven.append("y:");
            redBallEleven.append(fiveRedBallProbabilityDTO.getRedBallEleven());
            redBallEleven.append("}");
            //红球12
            if(redBallTwelve.length() != 0){
                redBallTwelve.append(",");
            }
            redBallTwelve.append("{");
            redBallTwelve.append("x:");
            redBallTwelve.append(fiveRedBallProbabilityDTO.getRedBallTwelve());
            redBallTwelve.append(",");
            redBallTwelve.append("y:");
            redBallTwelve.append(fiveRedBallProbabilityDTO.getRedBallTwelve());
            redBallTwelve.append("}");
            //红球13
            if(redBallThirteen.length() != 0){
                redBallThirteen.append(",");
            }
            redBallThirteen.append("{");
            redBallThirteen.append("x:");
            redBallThirteen.append(fiveRedBallProbabilityDTO.getRedBallThirteen());
            redBallThirteen.append(",");
            redBallThirteen.append("y:");
            redBallThirteen.append(fiveRedBallProbabilityDTO.getRedBallThirteen());
            redBallThirteen.append("}");
            //红球14
            if(redBallFourteen.length() != 0){
                redBallFourteen.append(",");
            }
            redBallFourteen.append("{");
            redBallFourteen.append("x:");
            redBallFourteen.append(fiveRedBallProbabilityDTO.getRedBallFourteen());
            redBallFourteen.append(",");
            redBallFourteen.append("y:");
            redBallFourteen.append(fiveRedBallProbabilityDTO.getRedBallFourteen());
            redBallFourteen.append("}");
            //红球15
            if(redBallFifteen.length() != 0){
                redBallFifteen.append(",");
            }
            redBallFifteen.append("{");
            redBallFifteen.append("x:");
            redBallFifteen.append(fiveRedBallProbabilityDTO.getRedBallFifteen());
            redBallFifteen.append(",");
            redBallFifteen.append("y:");
            redBallFifteen.append(fiveRedBallProbabilityDTO.getRedBallFifteen());
            redBallFifteen.append("}");
            //红球16
            if(redBallSixteen.length() != 0){
                redBallSixteen.append(",");
            }
            redBallSixteen.append("{");
            redBallSixteen.append("x:");
            redBallSixteen.append(fiveRedBallProbabilityDTO.getRedBallSixteen());
            redBallSixteen.append(",");
            redBallSixteen.append("y:");
            redBallSixteen.append(fiveRedBallProbabilityDTO.getRedBallSixteen());
            redBallSixteen.append("}");
            //红球17
            if(redBallSeventeen.length() != 0){
                redBallSeventeen.append(",");
            }
            redBallSeventeen.append("{");
            redBallSeventeen.append("x:");
            redBallSeventeen.append(fiveRedBallProbabilityDTO.getRedBallSeventeen());
            redBallSeventeen.append(",");
            redBallSeventeen.append("y:");
            redBallSeventeen.append(fiveRedBallProbabilityDTO.getRedBallSeventeen());
            redBallSeventeen.append("}");
            //红球18
            if(redBallEighteen.length() != 0){
                redBallEighteen.append(",");
            }
            redBallEighteen.append("{");
            redBallEighteen.append("x:");
            redBallEighteen.append(fiveRedBallProbabilityDTO.getRedBallEighteen());
            redBallEighteen.append(",");
            redBallEighteen.append("y:");
            redBallEighteen.append(fiveRedBallProbabilityDTO.getRedBallEighteen());
            redBallEighteen.append("}");
            //红球19
            if(redBallNineteen.length() != 0){
                redBallNineteen.append(",");
            }
            redBallNineteen.append("{");
            redBallNineteen.append("x:");
            redBallNineteen.append(fiveRedBallProbabilityDTO.getRedBallNineteen());
            redBallNineteen.append(",");
            redBallNineteen.append("y:");
            redBallNineteen.append(fiveRedBallProbabilityDTO.getRedBallNineteen());
            redBallNineteen.append("}");
            //红球20
            if(redBallTwenty.length() != 0){
                redBallTwenty.append(",");
            }
            redBallTwenty.append("{");
            redBallTwenty.append("x:");
            redBallTwenty.append(fiveRedBallProbabilityDTO.getRedBallTwenty());
            redBallTwenty.append(",");
            redBallTwenty.append("y:");
            redBallTwenty.append(fiveRedBallProbabilityDTO.getRedBallTwenty());
            redBallTwenty.append("}");
            //红球21
            if(redBallTwentyOne.length() != 0){
                redBallTwentyOne.append(",");
            }
            redBallTwentyOne.append("{");
            redBallTwentyOne.append("x:");
            redBallTwentyOne.append(fiveRedBallProbabilityDTO.getRedBallTwentyOne());
            redBallTwentyOne.append(",");
            redBallTwentyOne.append("y:");
            redBallTwentyOne.append(fiveRedBallProbabilityDTO.getRedBallTwentyOne());
            redBallTwentyOne.append("}");
            //红球22
            if(redBallTwentyTwo.length() != 0){
                redBallTwentyTwo.append(",");
            }
            redBallTwentyTwo.append("{");
            redBallTwentyTwo.append("x:");
            redBallTwentyTwo.append(fiveRedBallProbabilityDTO.getRedBallTwentyTwo());
            redBallTwentyTwo.append(",");
            redBallTwentyTwo.append("y:");
            redBallTwentyTwo.append(fiveRedBallProbabilityDTO.getRedBallTwentyTwo());
            redBallTwentyTwo.append("}");
            //红球23
            if(redBallTwentyThree.length() != 0){
                redBallTwentyThree.append(",");
            }
            redBallTwentyThree.append("{");
            redBallTwentyThree.append("x:");
            redBallTwentyThree.append(fiveRedBallProbabilityDTO.getRedBallTwentyThree());
            redBallTwentyThree.append(",");
            redBallTwentyThree.append("y:");
            redBallTwentyThree.append(fiveRedBallProbabilityDTO.getRedBallTwentyThree());
            redBallTwentyThree.append("}");
            //红球24
            if(redBallTwentyFour.length() != 0){
                redBallTwentyFour.append(",");
            }
            redBallTwentyFour.append("{");
            redBallTwentyFour.append("x:");
            redBallTwentyFour.append(fiveRedBallProbabilityDTO.getRedBallTwentyFour());
            redBallTwentyFour.append(",");
            redBallTwentyFour.append("y:");
            redBallTwentyFour.append(fiveRedBallProbabilityDTO.getRedBallTwentyFour());
            redBallTwentyFour.append("}");
            //红球25
            if(redBallTwentyFive.length() != 0){
                redBallTwentyFive.append(",");
            }
            redBallTwentyFive.append("{");
            redBallTwentyFive.append("x:");
            redBallTwentyFive.append(fiveRedBallProbabilityDTO.getRedBallTwentyFive());
            redBallTwentyFive.append(",");
            redBallTwentyFive.append("y:");
            redBallTwentyFive.append(fiveRedBallProbabilityDTO.getRedBallTwentyFive());
            redBallTwentyFive.append("}");
            //红球26
            if(redBallTwentySix.length() != 0){
                redBallTwentySix.append(",");
            }
            redBallTwentySix.append("{");
            redBallTwentySix.append("x:");
            redBallTwentySix.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallTwentySix.append(",");
            redBallTwentySix.append("y:");
            redBallTwentySix.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallTwentySix.append("}");
            //红球27
            if(redBallTwentySeven.length() != 0){
                redBallTwentySeven.append(",");
            }
            redBallTwentySeven.append("{");
            redBallTwentySeven.append("x:");
            redBallTwentySeven.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallTwentySeven.append(",");
            redBallTwentySeven.append("y:");
            redBallTwentySeven.append(fiveRedBallProbabilityDTO.getRedBallOne());
            redBallTwentySeven.append("}");
            //红球28
            if(redBallTwentyEight.length() != 0){
                redBallTwentyEight.append(",");
            }
            redBallTwentyEight.append("{");
            redBallTwentyEight.append("x:");
            redBallTwentyEight.append(fiveRedBallProbabilityDTO.getRedBallTwentyEight());
            redBallTwentyEight.append(",");
            redBallTwentyEight.append("y:");
            redBallTwentyEight.append(fiveRedBallProbabilityDTO.getRedBallTwentyEight());
            redBallTwentyEight.append("}");
            //红球29
            if(redBallTwentyNine.length() != 0){
                redBallTwentyNine.append(",");
            }
            redBallTwentyNine.append("{");
            redBallTwentyNine.append("x:");
            redBallTwentyNine.append(fiveRedBallProbabilityDTO.getRedBallTwentyNine());
            redBallTwentyNine.append(",");
            redBallTwentyNine.append("y:");
            redBallTwentyNine.append(fiveRedBallProbabilityDTO.getRedBallTwentyNine());
            redBallTwentyNine.append("}");
            //红球30
            if(redBallThirty.length() != 0){
                redBallThirty.append(",");
            }
            redBallThirty.append("{");
            redBallThirty.append("x:");
            redBallThirty.append(fiveRedBallProbabilityDTO.getRedBallThirty());
            redBallThirty.append(",");
            redBallThirty.append("y:");
            redBallThirty.append(fiveRedBallProbabilityDTO.getRedBallThirty());
            redBallThirty.append("}");
            //红球31
            if(redBallThirtyOne.length() != 0){
                redBallThirtyOne.append(",");
            }
            redBallThirtyOne.append("{");
            redBallThirtyOne.append("x:");
            redBallThirtyOne.append(fiveRedBallProbabilityDTO.getRedBallThirtyOne());
            redBallThirtyOne.append(",");
            redBallThirtyOne.append("y:");
            redBallThirtyOne.append(fiveRedBallProbabilityDTO.getRedBallThirtyOne());
            redBallThirtyOne.append("}");
            //红球32
            if(redBallThirtyTwo.length() != 0){
                redBallThirtyTwo.append(",");
            }
            redBallThirtyTwo.append("{");
            redBallThirtyTwo.append("x:");
            redBallThirtyTwo.append(fiveRedBallProbabilityDTO.getRedBallThirtyTwo());
            redBallThirtyTwo.append(",");
            redBallThirtyTwo.append("y:");
            redBallThirtyTwo.append(fiveRedBallProbabilityDTO.getRedBallThirtyTwo());
            redBallThirtyTwo.append("}");
            //红球33
            if(redBallThirtyThree.length() != 0){
                redBallThirtyThree.append(",");
            }
            redBallThirtyThree.append("{");
            redBallThirtyThree.append("x:");
            redBallThirtyThree.append(fiveRedBallProbabilityDTO.getRedBallThirtyThree());
            redBallThirtyThree.append(",");
            redBallThirtyThree.append("y:");
            redBallThirtyThree.append(fiveRedBallProbabilityDTO.getRedBallThirtyThree());
            redBallThirtyThree.append("}");
        }
        fiveRedBallListStr = "[[" + redBallOne.toString() + "],[" + redBallTwo.toString() + "],[" +redBallThree.toString()
                + "],[" + redBallFour.toString() + "],[" + redBallFive.toString() + "],[" + redBallSix.toString()
                + "],[" + redBallSeven.toString() + "],[" + redBallEight.toString() + "],[" + redBallNine.toString()
                + "],[" + redBallTen.toString() + "],[" + redBallEleven.toString() + "],[" + redBallTwelve.toString()
                + "],[" + redBallThirteen.toString() + "],[" + redBallFourteen.toString() + "],[" + redBallFifteen.toString()
                + "],[" + redBallSixteen.toString() + "],[" + redBallSeventeen.toString() + "],[" +redBallEighteen.toString()
                + "],[" + redBallNineteen.toString() + "],[" + redBallTwenty.toString() + "],[" + redBallTwentyOne.toString()
                + "],[" + redBallTwentyTwo.toString() + "],[" + redBallTwentyThree.toString() + "],[" + redBallTwentyFour.toString()
                + "],[" + redBallTwentyFive.toString() + "],[" + redBallTwentySix.toString() + "],[" + redBallTwentySeven.toString()
                + "],[" + redBallTwentyEight.toString() + "],[" + redBallTwentyNine.toString() + "],[" + redBallThirty.toString()
                + "],[" + redBallThirtyOne.toString() + "],[" + redBallThirtyTwo.toString() + "],[" + redBallThirtyThree.toString() + "]]";
        return fiveRedBallListStr;
    }


}
