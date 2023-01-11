# Release Process

This guide provides a chronological steps which goes through release tagging, staging, verification and publishing.

To see the original Jboss Richfaces guide, see [howto-release.adoc](howto-release.adoc)

## Check the SNAPSHOT builds and pass the tests

```bash
mvn clean install verify
mvn clean install verify -Prelease
export OPENSSL_CONF=/etc/ssl/
mvn clean install -Dintegration=wildfly81 -Dsmoke
```

## Set version, build and deploy

```bash
bash components/change_version.sh -r -o <4.5.0-SNAPSHOT> -n <4.5.0>
mvn clean install verify -Prelease
export OPENSSL_CONF=/etc/ssl/
mvn clean install -Dintegration=wildfly81 -Dsmoke

# edit README.md and dist/src/main/resources/txt/release-notes.txt
mvn clean install verify deploy -Psign,release

git add -A
git commit -S -s -m 'Release <4.5.0>'
git tag -a <4.5.0> -m "Tagging release <4.5.0>"
git push
git push --tags
```

## Build showcase

```bash
cd examples/showcase
mvn clean package -Prelease
```

## Prepare next iteration

```bash
bash components/change_version.sh -r -o <4.5.0> -n <4.5.1-SNAPSHOT>
# edit dist/src/main/resources/txt/release-notes.txt
git add -A
git commit -S -s -m 'Next release cycle'
```

## Create release and upload artifacts to github
