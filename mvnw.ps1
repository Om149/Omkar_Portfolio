$ErrorActionPreference = 'Stop'
$version = '3.9.9'
$base = Join-Path $PSScriptRoot ('.mvn\apache-maven-' + $version)
$exe = Join-Path $base 'bin\mvn.cmd'
if (-not (Test-Path $exe)) {
  $wrapperDir = Join-Path $PSScriptRoot '.mvn\wrapper'
  New-Item -ItemType Directory -Force -Path $wrapperDir | Out-Null
  $zip = Join-Path $wrapperDir "apache-maven-$version-bin.zip"
  $url = "https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/$version/apache-maven-$version-bin.zip"
  Write-Host "Downloading Apache Maven $version (first run only)..."
  Invoke-WebRequest -Uri $url -OutFile $zip
  Expand-Archive -Path $zip -DestinationPath (Join-Path $PSScriptRoot '.mvn') -Force
}
& $exe @args
exit $LASTEXITCODE
