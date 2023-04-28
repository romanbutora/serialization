cmake_minimum_required(VERSION 2.8)

project(app)

SET(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

find_package(PkgConfig REQUIRED)
FIND_PACKAGE(Boost 1.42.0 REQUIRED COMPONENTS system thread regex)
IF(Boost_FOUND)
  INCLUDE_DIRECTORIES(${Boost_INCLUDE_DIRS})
  LINK_DIRECTORIES(${Boost_LIBRARY_DIRS})
ENDIF(Boost_FOUND)

pkg_check_modules(JSONCPP jsoncpp)
link_libraries(${JSONCPP_LIBRARIES})

include(FindProtobuf)
find_package(Protobuf REQUIRED)
include_directories(${PROTOBUF_INCLUDE_DIR})

SET(USED_LIBS ${Boost_SYSTEM_LIBRARY} ${Boost_THREAD_LIBRARY} ${Boost_REGEX_LIBRARY} ${PROTOBUF_LIBRARY} -lavrocpp)

add_executable(${PROJECT_NAME} "main.cpp" "dataset.cpp" "measurementinfo.cpp" "result.cpp" "measurements.pb.h" "measurements.pb.cc")
target_link_libraries(${PROJECT_NAME} ${JSONCPP_LIBRARIES} ${USED_LIBS})