package org.opensplice.demo;

public class TempSensorDataWriterImpl extends org.opensplice.dds.dcps.DataWriterImpl implements TempSensorDataWriter
{
    private long copyCache;
    private TempSensorTypeSupport typeSupport;

    public TempSensorDataWriterImpl(org.opensplice.demo.TempSensorTypeSupport ts)
    {
        typeSupport = ts;
        copyCache = typeSupport.get_copyCache ();
    }

    public long register_instance(
            org.opensplice.demo.TempSensor instance_data)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.registerInstance(
                    this,
                    copyCache,
                    instance_data);
    }

    public long register_instance_w_timestamp(
            org.opensplice.demo.TempSensor instance_data, 
            DDS.Time_t source_timestamp)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.registerInstanceWTimestamp(
                    this,
                    copyCache,
                    instance_data,
                    source_timestamp);
    }

    public int unregister_instance(
            org.opensplice.demo.TempSensor instance_data, 
            long handle)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.unregisterInstance(
                    this,
                    copyCache,
                    instance_data,
                    handle);
    }

    public int unregister_instance_w_timestamp(
            org.opensplice.demo.TempSensor instance_data, 
            long handle, 
            DDS.Time_t source_timestamp)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.unregisterInstanceWTimestamp(
                    this,
                    copyCache,
                    instance_data,
                    handle,
                    source_timestamp);
    }

    public int write(
            org.opensplice.demo.TempSensor instance_data, 
            long handle)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.write(
                    this,
                    copyCache,
                    instance_data,
                    handle);
    }

    public int write_w_timestamp(
            org.opensplice.demo.TempSensor instance_data, 
            long handle, 
            DDS.Time_t source_timestamp)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.writeWTimestamp(
                    this,
                    copyCache,
                    instance_data,
                    handle,
                    source_timestamp);
    }

    public int dispose(
            org.opensplice.demo.TempSensor instance_data, 
            long instance_handle)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.dispose(
                    this,
                    copyCache,
                    instance_data,
                    instance_handle);
    }

    public int dispose_w_timestamp(
            org.opensplice.demo.TempSensor instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.disposeWTimestamp(
                    this,
                    copyCache,
                    instance_data,
                    instance_handle,
                    source_timestamp);
    }

    public int writedispose(
            org.opensplice.demo.TempSensor instance_data, 
            long handle)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.writedispose(
                    this,
                    copyCache,
                    instance_data,
                    handle);
    }

    public int writedispose_w_timestamp(
            org.opensplice.demo.TempSensor instance_data, 
            long handle, 
            DDS.Time_t source_timestamp)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.writedisposeWTimestamp(
                    this,
                    copyCache,
                    instance_data,
                    handle,
                    source_timestamp);
    }

    public int get_key_value(
            org.opensplice.demo.TempSensorHolder key_holder, 
            long handle)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.getKeyValue(
                    this,
                    copyCache,
                    key_holder,
                    handle);
    }
    
    public long lookup_instance(
            org.opensplice.demo.TempSensor instance_data)
    {
        return
            org.opensplice.dds.dcps.FooDataWriterImpl.lookupInstance(
                    this,
                    copyCache,
                    instance_data);
    }
}
