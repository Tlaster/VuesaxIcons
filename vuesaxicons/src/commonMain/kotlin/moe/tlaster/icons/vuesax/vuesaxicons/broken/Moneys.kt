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

public val BrokenGroup.Moneys: ImageVector
    get() {
        if (_moneys != null) {
            return _moneys!!
        }
        _moneys = Builder(name = "Moneys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.6992f, 7.92f)
                curveTo(1.6992f, 4.84f, 3.4592f, 3.52f, 6.0992f, 3.52f)
                horizontalLineTo(14.8892f)
                curveTo(17.1292f, 3.52f, 18.7392f, 4.47f, 19.1692f, 6.64f)
                curveTo(19.2492f, 7.03f, 19.2892f, 7.45f, 19.2892f, 7.92f)
                verticalLineTo(13.07f)
                curveTo(19.2892f, 16.15f, 17.5292f, 17.47f, 14.8892f, 17.47f)
                horizontalLineTo(6.0992f)
                curveTo(5.6492f, 17.47f, 5.2192f, 17.43f, 4.8192f, 17.34f)
                curveTo(4.5692f, 17.3f, 4.3292f, 17.23f, 4.1092f, 17.15f)
                curveTo(2.6092f, 16.59f, 1.6992f, 15.29f, 1.6992f, 13.07f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.3001f, 15.0101f)
                verticalLineTo(16.0701f)
                curveTo(22.3001f, 19.1501f, 20.5401f, 20.4701f, 17.9001f, 20.4701f)
                horizontalLineTo(9.1101f)
                curveTo(8.3701f, 20.4701f, 7.7001f, 20.3701f, 7.1201f, 20.1501f)
                curveTo(5.9301f, 19.7101f, 5.1201f, 18.8001f, 4.8301f, 17.3401f)
                curveTo(5.2301f, 17.4301f, 5.6601f, 17.4701f, 6.1101f, 17.4701f)
                horizontalLineTo(14.9001f)
                curveTo(17.5401f, 17.4701f, 19.3001f, 16.1501f, 19.3001f, 13.0701f)
                verticalLineTo(7.9201f)
                curveTo(19.3001f, 7.4501f, 19.2601f, 7.0301f, 19.1801f, 6.6401f)
                curveTo(21.0901f, 7.0301f, 22.3001f, 8.3701f, 22.3001f, 10.9201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1394f, 10.4999f)
                curveTo(13.1394f, 9.0399f, 11.9594f, 7.8599f, 10.4994f, 7.8599f)
                curveTo(9.0394f, 7.8599f, 7.8594f, 9.0399f, 7.8594f, 10.4999f)
                curveTo(7.8594f, 11.9599f, 9.0394f, 13.1399f, 10.4994f, 13.1399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.7793f, 8.3f)
                verticalLineTo(12.7001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2188f, 8.3f)
                verticalLineTo(12.7001f)
            }
        }
        .build()
        return _moneys!!
    }

private var _moneys: ImageVector? = null
