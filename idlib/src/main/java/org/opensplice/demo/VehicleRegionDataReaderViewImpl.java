package org.opensplice.demo;

public class VehicleRegionDataReaderViewImpl extends org.opensplice.dds.dcps.DataReaderViewImpl implements VehicleRegionDataReaderView
{
    private long copyCache;
    private VehicleRegionTypeSupport typeSupport;

    public VehicleRegionDataReaderViewImpl(org.opensplice.demo.VehicleRegionTypeSupport ts)
    {
        typeSupport = ts;
        copyCache = typeSupport.get_copyCache ();
    }

    public int read(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.read(
                    this,
                    copyCache,
                    received_data,
                    info_seq, 
                    max_samples, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int take(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.take(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int read_w_condition(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.readWCondition(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples, 
                    a_condition);
    }

    public int take_w_condition(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            DDS.ReadCondition a_condition)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.takeWCondition(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples, 
                    a_condition);
    }

    public int read_next_sample(
            org.opensplice.demo.VehicleRegionHolder received_data, 
            DDS.SampleInfoHolder sample_info)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.readNextSample (
                    this,
                    copyCache,
                    received_data, 
                    sample_info);
    }

    public int take_next_sample(
            org.opensplice.demo.VehicleRegionHolder received_data, 
            DDS.SampleInfoHolder sample_info)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.takeNextSample(
                    this,
                    copyCache,
                    received_data, 
                    sample_info);
    }

    public int read_instance(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.readInstance (
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int take_instance(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.takeInstance(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int read_next_instance(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.readNextInstance(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int take_next_instance(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            int sample_states, 
            int view_states, 
            int instance_states)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.takeNextInstance(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    sample_states, 
                    view_states, 
                    instance_states);
    }

    public int read_next_instance_w_condition(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.readNextInstanceWCondition(
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    a_condition);
    }

    public int take_next_instance_w_condition(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq, 
            int max_samples, 
            long a_handle, 
            DDS.ReadCondition a_condition)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.takeNextInstanceWCondition (
                    this,
                    copyCache,
                    received_data, 
                    info_seq, 
                    max_samples,
                    a_handle, 
                    a_condition);
    }

    public int return_loan(
            org.opensplice.demo.VehicleRegionSeqHolder received_data, 
            DDS.SampleInfoSeqHolder info_seq)
    {
        int result;

        if (received_data != null && info_seq != null) {
            if (received_data.value != null && info_seq.value != null) {
                if (received_data.value.length == info_seq.value.length) {
                    received_data.value = null;
                    info_seq.value = null;
                    result = DDS.RETCODE_OK.value;
                } else {
                    result = DDS.RETCODE_PRECONDITION_NOT_MET.value;
                }
            } else {
                if ((received_data.value == null) && (info_seq.value == null)) {
                    result = DDS.RETCODE_OK.value;
                } else {
                    result = DDS.RETCODE_PRECONDITION_NOT_MET.value;
                }
            }
        } else {
            result = DDS.RETCODE_BAD_PARAMETER.value;
        }
        return result;
    }

    public int get_key_value(
            org.opensplice.demo.VehicleRegionHolder key_holder, 
            long handle)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.getKeyValue (
                    this,
                    copyCache,
                    key_holder,
                    handle);
    }
    
    public long lookup_instance(
	org.opensplice.demo.VehicleRegion instance)
    {
        return
            org.opensplice.dds.dcps.FooDataReaderViewImpl.lookupInstance(
                    this,
                    copyCache,
                    instance);
    }

}
