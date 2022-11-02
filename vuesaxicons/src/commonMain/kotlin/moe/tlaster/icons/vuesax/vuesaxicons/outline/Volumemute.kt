package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Volumemute: ImageVector
    get() {
        if (_volumemute != null) {
            return _volumemute!!
        }
        _volumemute = Builder(name = "Volumemute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.05f, 20.5901f)
                curveTo(15.26f, 20.5901f, 14.39f, 20.3101f, 13.52f, 19.7601f)
                lineTo(10.6f, 17.9301f)
                curveTo(10.4f, 17.8101f, 10.17f, 17.7401f, 9.94f, 17.7401f)
                horizontalLineTo(8.5f)
                curveTo(6.08f, 17.7401f, 4.75f, 16.4101f, 4.75f, 13.9901f)
                verticalLineTo(9.9901f)
                curveTo(4.75f, 7.5701f, 6.08f, 6.2401f, 8.5f, 6.2401f)
                horizontalLineTo(9.93f)
                curveTo(10.16f, 6.2401f, 10.39f, 6.1701f, 10.59f, 6.0501f)
                lineTo(13.51f, 4.2201f)
                curveTo(14.97f, 3.3101f, 16.39f, 3.1401f, 17.51f, 3.7601f)
                curveTo(18.63f, 4.3801f, 19.24f, 5.6701f, 19.24f, 7.4001f)
                verticalLineTo(16.5701f)
                curveTo(19.24f, 18.2901f, 18.62f, 19.5901f, 17.51f, 20.2101f)
                curveTo(17.07f, 20.4701f, 16.57f, 20.5901f, 16.05f, 20.5901f)
                close()
                moveTo(8.5f, 7.7501f)
                curveTo(6.92f, 7.7501f, 6.25f, 8.4201f, 6.25f, 10.0001f)
                verticalLineTo(14.0001f)
                curveTo(6.25f, 15.5801f, 6.92f, 16.2501f, 8.5f, 16.2501f)
                horizontalLineTo(9.93f)
                curveTo(10.45f, 16.2501f, 10.95f, 16.3901f, 11.39f, 16.6701f)
                lineTo(14.31f, 18.5001f)
                curveTo(15.28f, 19.1001f, 16.18f, 19.2601f, 16.79f, 18.9201f)
                curveTo(17.4f, 18.5801f, 17.75f, 17.7301f, 17.75f, 16.6001f)
                verticalLineTo(7.4101f)
                curveTo(17.75f, 6.2701f, 17.4f, 5.4201f, 16.79f, 5.0901f)
                curveTo(16.18f, 4.7501f, 15.28f, 4.9001f, 14.31f, 5.5101f)
                lineTo(11.39f, 7.3401f)
                curveTo(10.95f, 7.6101f, 10.45f, 7.7601f, 9.93f, 7.7601f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.7501f)
                close()
            }
        }
        .build()
        return _volumemute!!
    }

private var _volumemute: ImageVector? = null
