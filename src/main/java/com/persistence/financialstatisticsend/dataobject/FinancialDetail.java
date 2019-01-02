package com.persistence.financialstatisticsend.dataobject;

import com.persistence.financialstatisticsend.enums.FinancialDebtEnum;
import com.persistence.financialstatisticsend.enums.FinancialPayEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class FinancialDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detailId;

    private Integer masterId;

    private Integer userId;

    private Integer categoryType;

    private BigDecimal financialPrice;

    private Date deadline;

    /*是否已经偿还 0表示未偿还 1表示已经还完*/
    private Integer hasPay = FinancialPayEnum.NO_PAY.getCode();

    /*是否是负债 0表示负债 1表示盈利*/
    private Integer isDebt = FinancialDebtEnum.DEBT.getCode();
}
