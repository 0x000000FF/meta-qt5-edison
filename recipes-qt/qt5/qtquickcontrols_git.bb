require qt5.inc
require qt5-git.inc

LICENSE = "GFDL-1.3 & BSD & LGPL-3.0 | GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv3;md5=b8c75190712063cde04e1f41b6fdad98 \
    file://LICENSE.GPLv3;md5=40f9bf30e783ddc201497165dfb32afb \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
    file://LICENSE.GPLv2;md5=05832301944453ec79e40ba3c3cfceec \
"

DEPENDS += "qtdeclarative"

RDEPENDS_${PN}-dev = ""

SRC_URI += " \
    file://0001-texteditor-fix-invalid-use-of-incomplete-type-class-.patch \
"

SRCREV = "85c2d2cce4c7d49bc425ccd0be2bbd9841b7e79b"
