SUMMARY = "Flutter App for AGL GSoC"
DESCRIPTION = "A simple Flutter app for AGL"

HOMEPAGE = "https://github.com/andoriyaprashant/agl_gsoc2025_task"
BUGTRACKER = "https://github.com/andoriyaprashant/agl_gsoc2025_task/issues"

SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=PUT_YOUR_MD5_HERE"

SRC_URI = "git://github.com/andoriyaprashant/agl_gsoc2025_task.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit agl-app flutter-app

# Flutter-specific variables
PUBSPEC_APPNAME = "agl_flutter_gsoc"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"
FLUTTER_BUILD_ARGS = "bundle -v"

# AGL-specific variables
AGL_APP_TEMPLATE = "agl-app-flutter"
AGL_APP_ID = "agl_flutter_gsoc"
AGL_APP_NAME = "Flutter GSoC App"

