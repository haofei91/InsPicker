package com.octopepper.mediapickerinstagram.components.video;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.octopepper.mediapickerinstagram.R;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CaptureVideoFragment extends Fragment {
    private static final int REQUEST_CODE_PERMISSIONS = 10;
    private static final String[] REQUIRED_PERMISSIONS = new String[]{Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO};


    private ExecutorService cameraExecutor;

//    CameraView cameraView;

    @BindView(R.id.takeVideo)
    ImageView takeVideo;

    @BindView(R.id.cameraVideoRootView)
    ViewGroup rootView;

    public static CaptureVideoFragment newInstance() {
        return new CaptureVideoFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.capture_video_view, container, false);
        ButterKnife.bind(view);
        return view;
    }

//    private void initViews(View container) {
//        cameraView = container.findViewById(R.id.cameraVideoViewFinder);
//        cameraView.setLifecycleOwner(this);
//        if (allPermissionsGranted()) {
//            cameraView.addCameraListener(new CameraListener() {
//                @Override
//                public void onVideoTaken(@NonNull VideoResult result) {
//                    super.onVideoTaken(result);
//                }
//
//                @Override
//                public void onVideoRecordingStart() {
//                    super.onVideoRecordingStart();
//                }
//
//                @Override
//                public void onVideoRecordingEnd() {
//                    super.onVideoRecordingEnd();
//                }
//            });
//        } else {
//            ActivityCompat.requestPermissions(getActivity(), REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS);
//        }
//    }

    private void updateCameraUi() {

    }

    private void bindCameraUseCases() {

    }

    private boolean allPermissionsGranted() {
        for (String permission : REQUIRED_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(
                    getContext(), permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cameraExecutor = Executors.newSingleThreadExecutor();
//        initViews(view);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (allPermissionsGranted()) {
//                cameraView.post(() -> startCamera());
            } else {
                Toast.makeText(getContext(),
                        "Permissions not granted by the user.",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startCamera() {


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        cameraExecutor.shutdown();
    }
}
