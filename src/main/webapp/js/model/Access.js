Ext.define('Access', {
    extend: 'Ext.data.Model',
    fields: [{
        name : 'id',
        type : 'int',
        editor : {
            xtype : 'hidden'
        }
    }, {
        name : 'dataset_id',
        type : 'int',
        editor : {
            xtype : 'hidden'
        }
    }, {
        name : 'service_id',
        type : 'int',
        editor : {
            xtype : 'combo',
            fieldLabel : 'Service Name',
            store : new Ext.data.Store({
                model : 'Service',
                autoLoad : true
            }),
            queryMode : 'local',
            displayField : 'name',
            valueField : 'id',
            name : 'service_id',
            triggerAction : 'all',
            typeAhead : true,
            forceSelection : true
        }
    }, {
        name : 'dataformat_id',
        type : 'int',
        editor : {
            xtype: 'combo',
            fieldLabel : 'Data Format',
            store : new Ext.data.Store({
                model : 'DataFormat',
                autoLoad : true
            }),
            queryMode: 'local',
            displayField: 'type',
            valueField: 'id',
            name : 'dataformat_id',
            triggerAction : 'all',
            typeAhead : true,
            forceSelection : true
        }
    }, {
        name : 'url_path',
        type : 'string',
        editor : {
            xtype: 'textfield',
            fieldLabel : 'URL Path',
            allowBlank : false,
            name : 'url_path'
        }
    }],
    proxy: {
        type : 'spec',
        api : {
            read : 'service/catalog/json/access',
            create : 'service/catalog/json/access/create',
            update : 'service/catalog/json/access/update',
            destroy : 'service/catalog/json/access/delete'
        },
        reader : {
            type : 'spec',
            idProperty : 'id'
        },
        writer : {
            type : 'kvp',
            writeAllFields : false
        },
        listeners : {
            "exception" : function(proxy, response, operation, options) {
            //				console.log("Proxy Exception");
            }
        }
    },
    belongsTo: 'Dataset'
});