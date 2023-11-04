SUMMARY = "My custom Linux image."


IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_FEATURES += "splash"
IMAGE_FEATURES += "tools-debug"
IMAGE_FEATURES += "tools-profile"
IMAGE_FEATURES += "tools-sdk"
IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL:append = " mc"
IMAGE_INSTALL:append = " nano"


# Change root password (note the capital -P)
EXTRA_USERS_PARAMS = "\
  usermod -P '******'  root \
  "
