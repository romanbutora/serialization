#ifndef MEASUREMENTS_H_2643870712__H_
#define MEASUREMENTS_H_2643870712__H_


#include <sstream>
#include "boost/any.hpp"
#include "avro/Specific.hh"
#include "avro/Encoder.hh"
#include "avro/Decoder.hh"

struct AMeasurementInfo {
    int32_t id;
    int64_t timestamp;
    std::string measurerName;
    AMeasurementInfo() :
        id(int32_t()),
        timestamp(int64_t()),
        measurerName(std::string())
        { }
};

struct ADataset {
    AMeasurementInfo info;
    std::map<std::string, std::vector<double > > records;
    ADataset() :
        info(AMeasurementInfo()),
        records(std::map<std::string, std::vector<double > >())
        { }
};

struct ADatasets {
    std::vector<ADataset > datasets;
    ADatasets() :
        datasets(std::vector<ADataset >())
        { }
};

struct AResult {
    AMeasurementInfo info;
    std::map<std::string, double > averages;
    AResult() :
        info(AMeasurementInfo()),
        averages(std::map<std::string, double >())
        { }
};

struct AResults {
    std::vector<AResult > results;
    AResults() :
        results(std::vector<AResult >())
        { }
};

struct measurements_avsc_Union__0__ {
private:
    size_t idx_;
    boost::any value_;
public:
    size_t idx() const { return idx_; }
    AMeasurementInfo get_AMeasurementInfo() const;
    void set_AMeasurementInfo(const AMeasurementInfo& v);
    ADataset get_ADataset() const;
    void set_ADataset(const ADataset& v);
    ADatasets get_ADatasets() const;
    void set_ADatasets(const ADatasets& v);
    AResult get_AResult() const;
    void set_AResult(const AResult& v);
    AResults get_AResults() const;
    void set_AResults(const AResults& v);
    measurements_avsc_Union__0__();
};

inline
AMeasurementInfo measurements_avsc_Union__0__::get_AMeasurementInfo() const {
    if (idx_ != 0) {
        throw avro::Exception("Invalid type for union");
    }
    return boost::any_cast<AMeasurementInfo >(value_);
}

inline
void measurements_avsc_Union__0__::set_AMeasurementInfo(const AMeasurementInfo& v) {
    idx_ = 0;
    value_ = v;
}

inline
ADataset measurements_avsc_Union__0__::get_ADataset() const {
    if (idx_ != 1) {
        throw avro::Exception("Invalid type for union");
    }
    return boost::any_cast<ADataset >(value_);
}

inline
void measurements_avsc_Union__0__::set_ADataset(const ADataset& v) {
    idx_ = 1;
    value_ = v;
}

inline
ADatasets measurements_avsc_Union__0__::get_ADatasets() const {
    if (idx_ != 2) {
        throw avro::Exception("Invalid type for union");
    }
    return boost::any_cast<ADatasets >(value_);
}

inline
void measurements_avsc_Union__0__::set_ADatasets(const ADatasets& v) {
    idx_ = 2;
    value_ = v;
}

inline
AResult measurements_avsc_Union__0__::get_AResult() const {
    if (idx_ != 3) {
        throw avro::Exception("Invalid type for union");
    }
    return boost::any_cast<AResult >(value_);
}

inline
void measurements_avsc_Union__0__::set_AResult(const AResult& v) {
    idx_ = 3;
    value_ = v;
}

inline
AResults measurements_avsc_Union__0__::get_AResults() const {
    if (idx_ != 4) {
        throw avro::Exception("Invalid type for union");
    }
    return boost::any_cast<AResults >(value_);
}

inline
void measurements_avsc_Union__0__::set_AResults(const AResults& v) {
    idx_ = 4;
    value_ = v;
}

inline measurements_avsc_Union__0__::measurements_avsc_Union__0__() : idx_(0), value_(AMeasurementInfo()) { }
namespace avro {
template<> struct codec_traits<AMeasurementInfo> {
    static void encode(Encoder& e, const AMeasurementInfo& v) {
        avro::encode(e, v.id);
        avro::encode(e, v.timestamp);
        avro::encode(e, v.measurerName);
    }
    static void decode(Decoder& d, AMeasurementInfo& v) {
        if (avro::ResolvingDecoder *rd =
            dynamic_cast<avro::ResolvingDecoder *>(&d)) {
            const std::vector<size_t> fo = rd->fieldOrder();
            for (std::vector<size_t>::const_iterator it = fo.begin();
                it != fo.end(); ++it) {
                switch (*it) {
                case 0:
                    avro::decode(d, v.id);
                    break;
                case 1:
                    avro::decode(d, v.timestamp);
                    break;
                case 2:
                    avro::decode(d, v.measurerName);
                    break;
                default:
                    break;
                }
            }
        } else {
            avro::decode(d, v.id);
            avro::decode(d, v.timestamp);
            avro::decode(d, v.measurerName);
        }
    }
};

template<> struct codec_traits<ADataset> {
    static void encode(Encoder& e, const ADataset& v) {
        avro::encode(e, v.info);
        avro::encode(e, v.records);
    }
    static void decode(Decoder& d, ADataset& v) {
        if (avro::ResolvingDecoder *rd =
            dynamic_cast<avro::ResolvingDecoder *>(&d)) {
            const std::vector<size_t> fo = rd->fieldOrder();
            for (std::vector<size_t>::const_iterator it = fo.begin();
                it != fo.end(); ++it) {
                switch (*it) {
                case 0:
                    avro::decode(d, v.info);
                    break;
                case 1:
                    avro::decode(d, v.records);
                    break;
                default:
                    break;
                }
            }
        } else {
            avro::decode(d, v.info);
            avro::decode(d, v.records);
        }
    }
};

template<> struct codec_traits<ADatasets> {
    static void encode(Encoder& e, const ADatasets& v) {
        avro::encode(e, v.datasets);
    }
    static void decode(Decoder& d, ADatasets& v) {
        if (avro::ResolvingDecoder *rd =
            dynamic_cast<avro::ResolvingDecoder *>(&d)) {
            const std::vector<size_t> fo = rd->fieldOrder();
            for (std::vector<size_t>::const_iterator it = fo.begin();
                it != fo.end(); ++it) {
                switch (*it) {
                case 0:
                    avro::decode(d, v.datasets);
                    break;
                default:
                    break;
                }
            }
        } else {
            avro::decode(d, v.datasets);
        }
    }
};

template<> struct codec_traits<AResult> {
    static void encode(Encoder& e, const AResult& v) {
        avro::encode(e, v.info);
        avro::encode(e, v.averages);
    }
    static void decode(Decoder& d, AResult& v) {
        if (avro::ResolvingDecoder *rd =
            dynamic_cast<avro::ResolvingDecoder *>(&d)) {
            const std::vector<size_t> fo = rd->fieldOrder();
            for (std::vector<size_t>::const_iterator it = fo.begin();
                it != fo.end(); ++it) {
                switch (*it) {
                case 0:
                    avro::decode(d, v.info);
                    break;
                case 1:
                    avro::decode(d, v.averages);
                    break;
                default:
                    break;
                }
            }
        } else {
            avro::decode(d, v.info);
            avro::decode(d, v.averages);
        }
    }
};

template<> struct codec_traits<AResults> {
    static void encode(Encoder& e, const AResults& v) {
        avro::encode(e, v.results);
    }
    static void decode(Decoder& d, AResults& v) {
        if (avro::ResolvingDecoder *rd =
            dynamic_cast<avro::ResolvingDecoder *>(&d)) {
            const std::vector<size_t> fo = rd->fieldOrder();
            for (std::vector<size_t>::const_iterator it = fo.begin();
                it != fo.end(); ++it) {
                switch (*it) {
                case 0:
                    avro::decode(d, v.results);
                    break;
                default:
                    break;
                }
            }
        } else {
            avro::decode(d, v.results);
        }
    }
};

template<> struct codec_traits<measurements_avsc_Union__0__> {
    static void encode(Encoder& e, measurements_avsc_Union__0__ v) {
        e.encodeUnionIndex(v.idx());
        switch (v.idx()) {
        case 0:
            avro::encode(e, v.get_AMeasurementInfo());
            break;
        case 1:
            avro::encode(e, v.get_ADataset());
            break;
        case 2:
            avro::encode(e, v.get_ADatasets());
            break;
        case 3:
            avro::encode(e, v.get_AResult());
            break;
        case 4:
            avro::encode(e, v.get_AResults());
            break;
        }
    }
    static void decode(Decoder& d, measurements_avsc_Union__0__& v) {
        size_t n = d.decodeUnionIndex();
        if (n >= 5) { throw avro::Exception("Union index too big"); }
        switch (n) {
        case 0:
            {
                AMeasurementInfo vv;
                avro::decode(d, vv);
                v.set_AMeasurementInfo(vv);
            }
            break;
        case 1:
            {
                ADataset vv;
                avro::decode(d, vv);
                v.set_ADataset(vv);
            }
            break;
        case 2:
            {
                ADatasets vv;
                avro::decode(d, vv);
                v.set_ADatasets(vv);
            }
            break;
        case 3:
            {
                AResult vv;
                avro::decode(d, vv);
                v.set_AResult(vv);
            }
            break;
        case 4:
            {
                AResults vv;
                avro::decode(d, vv);
                v.set_AResults(vv);
            }
            break;
        }
    }
};

}
#endif