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

public val BrokenGroup.Playcricle: ImageVector
    get() {
        if (_playcricle != null) {
            return _playcricle!!
        }
        _playcricle = Builder(name = "Playcricle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0703f, 19.0699f)
                curveTo(22.9803f, 15.1599f, 22.9803f, 8.8299f, 19.0703f, 4.9299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9306f, 4.9299f)
                curveTo(1.0206f, 8.8399f, 1.0206f, 15.1699f, 4.9306f, 19.0699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6992f, 21.4099f)
                curveTo(9.7692f, 21.7799f, 10.8792f, 21.96f, 11.9992f, 21.96f)
                curveTo(13.1192f, 21.95f, 14.2292f, 21.7799f, 15.2992f, 21.4099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6992f, 2.5901f)
                curveTo(9.7692f, 2.2201f, 10.8792f, 2.04f, 11.9992f, 2.04f)
                curveTo(13.1192f, 2.04f, 14.2292f, 2.2201f, 15.2992f, 2.5901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7402f, 10.3302f)
                curveTo(8.7402f, 8.2502f, 10.2103f, 7.4001f, 12.0103f, 8.4401f)
                lineTo(13.4602f, 9.2802f)
                lineTo(14.9102f, 10.1201f)
                curveTo(16.7102f, 11.1601f, 16.7102f, 12.8602f, 14.9102f, 13.9002f)
                lineTo(13.4602f, 14.7401f)
                lineTo(12.0103f, 15.5802f)
                curveTo(10.2103f, 16.6202f, 8.7402f, 15.7701f, 8.7402f, 13.6901f)
            }
        }
        .build()
        return _playcricle!!
    }

private var _playcricle: ImageVector? = null
