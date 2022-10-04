Write-Progress -Activity "Tar kaffe" -PercentComplete 1
$lines = Get-Content ./../data/stocks.csv
$lines[1] = "NEL;15,70;-16,67%;32 720;1183,82"
$lines | Set-Content ./../data/stocks.csv
[System.Threading.Thread]::Sleep(500)
Write-Progress -Activity "Tar kaffe" -PercentComplete 25
[System.Threading.Thread]::Sleep(500)
Write-Progress -Activity "Tar kaffe" -PercentComplete 50
[System.Threading.Thread]::Sleep(500)
Write-Progress -Activity "Tar kaffe" -PercentComplete 75
[System.Threading.Thread]::Sleep(500)
Write-Progress -Activity "Tar kaffe" -PercentComplete 100 -Complete
