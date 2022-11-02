package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0605f, 22.1601f)
                horizontalLineTo(5.9405f)
                curveTo(3.9905f, 22.1601f, 2.5005f, 21.4501f, 1.7405f, 20.1701f)
                curveTo(0.9905f, 18.8901f, 1.0905f, 17.2401f, 2.0405f, 15.5401f)
                lineTo(8.1005f, 4.6301f)
                curveTo(9.1005f, 2.8301f, 10.4805f, 1.8401f, 12.0005f, 1.8401f)
                curveTo(13.5205f, 1.8401f, 14.9005f, 2.8301f, 15.9005f, 4.6301f)
                lineTo(21.9605f, 15.5401f)
                curveTo(22.9105f, 17.2501f, 23.0205f, 18.8901f, 22.2605f, 20.1701f)
                curveTo(21.5005f, 21.4501f, 20.0105f, 22.1601f, 18.0605f, 22.1601f)
                close()
                moveTo(12.0005f, 3.3401f)
                curveTo(11.0605f, 3.3401f, 10.1405f, 4.0601f, 9.4105f, 5.3601f)
                lineTo(3.3605f, 16.2701f)
                curveTo(2.6805f, 17.4901f, 2.5705f, 18.6101f, 3.0405f, 19.4201f)
                curveTo(3.5105f, 20.2201f, 4.5505f, 20.6701f, 5.9505f, 20.6701f)
                horizontalLineTo(18.0705f)
                curveTo(19.4705f, 20.6701f, 20.5005f, 20.2301f, 20.9805f, 19.4201f)
                curveTo(21.4505f, 18.6101f, 21.3405f, 17.5001f, 20.6605f, 16.2701f)
                lineTo(14.5905f, 5.3601f)
                curveTo(13.8605f, 4.0601f, 12.9405f, 3.3401f, 12.0005f, 3.3401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4408f, 20.75f)
                curveTo(21.2908f, 20.75f, 21.1408f, 20.71f, 21.0108f, 20.61f)
                lineTo(12.0008f, 14.3f)
                lineTo(2.9908f, 20.61f)
                curveTo(2.6508f, 20.85f, 2.1808f, 20.77f, 1.9508f, 20.43f)
                curveTo(1.7108f, 20.09f, 1.7908f, 19.62f, 2.1308f, 19.39f)
                lineTo(11.5708f, 12.78f)
                curveTo(11.8308f, 12.6f, 12.1708f, 12.6f, 12.4308f, 12.78f)
                lineTo(21.8708f, 19.39f)
                curveTo(22.2108f, 19.63f, 22.2908f, 20.1f, 22.0508f, 20.43f)
                curveTo(21.9108f, 20.64f, 21.6808f, 20.75f, 21.4408f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.14f)
                curveTo(11.59f, 14.14f, 11.25f, 13.8f, 11.25f, 13.39f)
                verticalLineTo(3.0f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12.0f, 2.25f)
                curveTo(12.41f, 2.25f, 12.75f, 2.59f, 12.75f, 3.0f)
                verticalLineTo(13.39f)
                curveTo(12.75f, 13.8f, 12.41f, 14.14f, 12.0f, 14.14f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
