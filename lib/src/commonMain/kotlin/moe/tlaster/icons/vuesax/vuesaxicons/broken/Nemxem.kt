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

public val BrokenGroup.Nemxem: ImageVector
    get() {
        if (_nemxem != null) {
            return _nemxem!!
        }
        _nemxem = Builder(name = "Nemxem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.03f, 13.7099f)
                curveTo(2.84f, 11.3599f, 2.0f, 8.4699f, 2.0f, 4.9999f)
                curveTo(2.0f, 4.9999f, 12.0f, -1.0001f, 22.0f, 4.9999f)
                curveTo(22.0f, 4.9999f, 22.0f, 15.9999f, 12.0f, 21.9999f)
                curveTo(12.0f, 21.9999f, 9.27f, 20.6299f, 6.66f, 17.6199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0996f, 7.0701f)
                curveTo(5.2096f, 17.1501f, 11.9996f, 10.0001f, 11.9996f, 10.0001f)
                curveTo(10.9996f, 4.0001f, 16.0696f, 2.9401f, 16.0696f, 2.9401f)
                lineTo(16.6596f, 2.8301f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.35f, 18.51f)
                curveTo(16.35f, 18.51f, 19.0f, 13.0f, 12.0f, 10.0f)
            }
        }
        .build()
        return _nemxem!!
    }

private var _nemxem: ImageVector? = null
