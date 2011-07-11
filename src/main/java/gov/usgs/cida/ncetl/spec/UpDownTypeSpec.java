package gov.usgs.cida.ncetl.spec;

import gov.usgs.webservices.jdbc.spec.mapping.ColumnMapping;
import gov.usgs.webservices.jdbc.spec.mapping.SearchMapping;
import gov.usgs.webservices.jdbc.spec.mapping.WhereClauseType;

/**
 *
 * @author Jordan Walker <jiwalker@usgs.gov>
 */
public class UpDownTypeSpec extends AbstractNcetlSpec {
    private static final long serialVersionUID = 1L;
    
    private static final String TABLE_NAME = "up_down_type";
    private static final String TYPE = "type";
    
    @Override
    public String setupTableName() {
        return TABLE_NAME;
    }
    
    @Override
    public boolean setupAccess_DELETE() {
        return false;
    }

    @Override
    public boolean setupAccess_INSERT() {
        return false;
    }

    @Override
    public boolean setupAccess_UPDATE() {
        return false;
    }

    @Override
    public ColumnMapping[] setupColumnMap() {
        return new ColumnMapping[] {
                    new ColumnMapping(ID, ID),
                    new ColumnMapping(TYPE, TYPE),
                    new ColumnMapping(INSERTED, null),
                    new ColumnMapping(UPDATED, null)
                };
    }

    @Override
    public SearchMapping[] setupSearchMap() {
        return new SearchMapping[] {
            new SearchMapping(ID, ID, null, WhereClauseType.equals, null, null, null),
            new SearchMapping("s_" + TYPE, TYPE, TYPE, WhereClauseType.equals, null, null, null),
            new SearchMapping("s_" + INSERTED, INSERTED, INSERTED, WhereClauseType.equals, null, null, null),
            new SearchMapping("s_" + UPDATED, UPDATED, UPDATED, WhereClauseType.equals, null, null, null)
        };
    }
}
