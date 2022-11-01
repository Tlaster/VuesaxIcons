package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Directboxreceive: ImageVector
    get() {
        if (_directboxreceive != null) {
            return _directboxreceive!!
        }
        _directboxreceive = Builder(name = "Directboxreceive", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineTo(10.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.0f)
                curveTo(3.0f, 12.0f, 3.0f, 13.79f, 3.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 19.76f, 3.0f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 21.0f, 19.76f, 21.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 13.79f, 21.0f, 12.0f, 17.0f, 12.0f)
                curveTo(16.0f, 12.0f, 15.72f, 12.21f, 15.2f, 12.6f)
                lineTo(14.18f, 13.68f)
                curveTo(13.0f, 14.94f, 11.0f, 14.94f, 9.81f, 13.68f)
                lineTo(8.8f, 12.6f)
                curveTo(8.28f, 12.21f, 8.0f, 12.0f, 7.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 5.99f, 5.0f, 4.33f, 8.0f, 4.04f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 5.99f, 19.0f, 4.33f, 16.0f, 4.04f)
            }
        }
        .build()
        return _directboxreceive!!
    }

private var _directboxreceive: ImageVector? = null
