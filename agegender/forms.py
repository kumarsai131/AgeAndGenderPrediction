from PIL import Image
from django import forms
from django.core.files.uploadedfile import SimpleUploadedFile
from .models import *
class ImageUploadForm(forms.ModelForm):
    class Meta:
        model= ExampleModel
        fields=['image']

