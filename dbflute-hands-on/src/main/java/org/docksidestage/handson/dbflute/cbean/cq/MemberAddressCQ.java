package org.docksidestage.handson.dbflute.cbean.cq;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.handson.dbflute.cbean.cq.bs.BsMemberAddressCQ;

/**
 * The condition-query of member_address.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressCQ extends BsMemberAddressCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // You should NOT touch with this constructor.
    /**
     * Auto-generated constructor to create query instance, basically called in DBFlute.
     * @param referrerQuery The instance of referrer query. (NullAllowed: if null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias name for this query. (NotNull)
     * @param nestLevel The nest level of this query. (if zero, this is base query)
     */
    public MemberAddressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here. e.g. public void arrangeXxx()
}
