package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Directinbox: ImageVector
    get() {
        if (_directinbox != null) {
            return _directinbox!!
        }
        _directinbox = Builder(name = "Directinbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(9.0f)
                lineTo(14.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                lineTo(10.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9805f, 13.0f)
                horizontalLineTo(6.3905f)
                curveTo(6.7705f, 13.0f, 7.1105f, 13.21f, 7.2805f, 13.55f)
                lineTo(8.4505f, 15.89f)
                curveTo(8.7905f, 16.57f, 9.4805f, 17.0f, 10.2405f, 17.0f)
                horizontalLineTo(13.7705f)
                curveTo(14.5305f, 17.0f, 15.2205f, 16.57f, 15.5605f, 15.89f)
                lineTo(16.7305f, 13.55f)
                curveTo(16.9005f, 13.21f, 17.2505f, 13.0f, 17.6205f, 13.0f)
                horizontalLineTo(21.9805f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6895f, 18.9999f)
                curveTo(3.6495f, 21.0999f, 5.6494f, 21.9999f, 8.9994f, 21.9999f)
                horizontalLineTo(14.9995f)
                curveTo(19.9995f, 21.9999f, 21.9995f, 19.9999f, 21.9995f, 14.9999f)
                verticalLineTo(10.9999f)
                curveTo(21.9995f, 6.7299f, 20.5395f, 4.6499f, 16.9995f, 4.1299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 4.1299f)
                curveTo(3.46f, 4.6499f, 2.0f, 6.7299f, 2.0f, 10.9999f)
                verticalLineTo(14.9999f)
            }
        }
        .build()
        return _directinbox!!
    }

private var _directinbox: ImageVector? = null
