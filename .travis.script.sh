#!/usr/bin/env bash

# TRAVIS_PULL_REQUEST == "false" for a normal branch commit, the PR number for a PR
# TRAVIS_BRANCH == target of normal commit or target of PR
# TRAVIS_SECURE_ENV_VARS == true if encrypted variables, e.g. TESTBENCH_LICENSE is available
# TRAVIS_REPO_SLUG == the repository, e.g. vaadin/vaadin

if [ "$TRAVIS_PULL_REQUEST" != "false" ] && [ "${TRAVIS_BRANCH}" == "master" ] && [ "$TRAVIS_SECURE_ENV_VARS" == "true" ]
then
	# Pull request for master with secure variables available
	mvn -B -e -V -Dvaadin.testbench.developer.license=$TESTBENCH_LICENSE clean verify
else
	# Something else than a pull request inside the repository
	mvn -B -e -V -Dvaadin.testbench.developer.license=$TESTBENCH_LICENSE clean verify
fi