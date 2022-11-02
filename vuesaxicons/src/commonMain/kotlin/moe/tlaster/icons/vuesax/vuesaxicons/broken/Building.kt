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

public val BrokenGroup.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9707f, 5.9501f)
                verticalLineTo(5.0901f)
                curveTo(1.9707f, 2.4701f, 3.9207f, 1.2801f, 6.3107f, 2.4501f)
                lineTo(10.7507f, 4.6301f)
                curveTo(11.7107f, 5.1001f, 12.5007f, 6.3501f, 12.5007f, 7.4101f)
                verticalLineTo(22.0001f)
                horizontalLineTo(4.0807f)
                curveTo(2.9207f, 22.0001f, 1.9707f, 21.0701f, 1.9707f, 19.9301f)
                verticalLineTo(10.0201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 15.0599f)
                verticalLineTo(18.8399f)
                curveTo(21.97f, 20.9999f, 20.97f, 21.9999f, 18.81f, 21.9999f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.4199f)
                lineTo(12.97f, 10.5199f)
                lineTo(17.47f, 11.5299f)
                lineTo(19.5f, 11.9799f)
                curveTo(20.82f, 12.2699f, 21.9f, 12.9499f, 21.96f, 14.8699f)
                curveTo(21.97f, 14.9299f, 21.97f, 14.9899f, 21.97f, 15.0599f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 9.0f)
                horizontalLineTo(8.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 13.0f)
                horizontalLineTo(8.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4707f, 11.53f)
                verticalLineTo(14.75f)
                curveTo(17.4707f, 15.99f, 16.4607f, 17.0f, 15.2207f, 17.0f)
                curveTo(13.9807f, 17.0f, 12.9707f, 15.99f, 12.9707f, 14.75f)
                verticalLineTo(10.52f)
                lineTo(17.4707f, 11.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9607f, 14.87f)
                curveTo(21.9007f, 16.05f, 20.9207f, 17.0f, 19.7207f, 17.0f)
                curveTo(18.4807f, 17.0f, 17.4707f, 15.99f, 17.4707f, 14.75f)
                verticalLineTo(11.53f)
                lineTo(19.5007f, 11.98f)
                curveTo(20.8207f, 12.27f, 21.9007f, 12.95f, 21.9607f, 14.87f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
