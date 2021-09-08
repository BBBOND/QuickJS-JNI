cmake_minimum_required(VERSION 3.10.2)
project("quickjs")

file(GLOB_RECURSE sources "./*.c" "./*.cpp")

add_library(quickjs SHARED ${sources})

find_library(log-lib log)
target_compile_definitions(quickjs PUBLIC CONFIG_VERSION="${QUICKJS_VERSION}")
target_link_libraries(quickjs ${log-lib})