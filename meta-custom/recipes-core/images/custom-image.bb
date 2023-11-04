SUMMARY = "My custom Linux image."


IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit extrausers

# Change root password (note the capital -P)
EXTRA_USERS_PARAMS = "\
  usermod -P '******'  root \
  "
