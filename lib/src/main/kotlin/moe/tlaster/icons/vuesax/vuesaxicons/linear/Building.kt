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

public val LinearGroup.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 22.0001f)
                horizontalLineTo(4.08f)
                curveTo(2.92f, 22.0001f, 1.97f, 21.0701f, 1.97f, 19.9301f)
                verticalLineTo(5.0901f)
                curveTo(1.97f, 2.4701f, 3.92f, 1.2801f, 6.31f, 2.4501f)
                lineTo(10.75f, 4.6301f)
                curveTo(11.71f, 5.1001f, 12.5f, 6.3501f, 12.5f, 7.4101f)
                verticalLineTo(22.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 15.0602f)
                verticalLineTo(18.8402f)
                curveTo(21.97f, 21.0002f, 20.97f, 22.0002f, 18.81f, 22.0002f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.4202f)
                lineTo(12.97f, 10.5202f)
                lineTo(17.47f, 11.5302f)
                lineTo(19.5f, 11.9802f)
                curveTo(20.82f, 12.2702f, 21.9f, 12.9502f, 21.96f, 14.8702f)
                curveTo(21.97f, 14.9302f, 21.97f, 14.9902f, 21.97f, 15.0602f)
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
                moveTo(17.47f, 11.53f)
                verticalLineTo(14.75f)
                curveTo(17.47f, 15.99f, 16.46f, 17.0f, 15.22f, 17.0f)
                curveTo(13.98f, 17.0f, 12.97f, 15.99f, 12.97f, 14.75f)
                verticalLineTo(10.52f)
                lineTo(17.47f, 11.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.96f, 14.87f)
                curveTo(21.9f, 16.05f, 20.92f, 17.0f, 19.72f, 17.0f)
                curveTo(18.48f, 17.0f, 17.47f, 15.99f, 17.47f, 14.75f)
                verticalLineTo(11.53f)
                lineTo(19.5f, 11.98f)
                curveTo(20.82f, 12.27f, 21.9f, 12.95f, 21.96f, 14.87f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
