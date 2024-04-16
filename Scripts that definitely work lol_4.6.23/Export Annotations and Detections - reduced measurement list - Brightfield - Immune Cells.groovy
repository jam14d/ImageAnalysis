def entry = getProjectEntry()
def name = entry.getImageName() + '.txt'

def path = buildFilePath(PROJECT_BASE_DIR, 'annotations_binned_11.13.23')
mkdirs(path)
path = buildFilePath(path, name)
saveAnnotationMeasurements(path)

def path2 = buildFilePath(PROJECT_BASE_DIR, 'detections_binned_11.13.23')
mkdirs(path2)
path = buildFilePath(path2, name)
saveDetectionMeasurements(path2)

print 'Results exported to ' + path