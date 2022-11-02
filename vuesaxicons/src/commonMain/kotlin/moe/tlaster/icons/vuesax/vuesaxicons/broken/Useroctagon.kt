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

public val BrokenGroup.Useroctagon: ImageVector
    get() {
        if (_useroctagon != null) {
            return _useroctagon!!
        }
        _useroctagon = Builder(name = "Useroctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4299f, 2.42f)
                curveTo(11.3999f, 1.86f, 12.5999f, 1.86f, 13.5799f, 2.42f)
                lineTo(19.5199f, 5.85f)
                curveTo(20.4899f, 6.41f, 21.0899f, 7.45f, 21.0899f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.0899f, 16.54f, 20.4899f, 17.58f, 19.5199f, 18.15f)
                lineTo(13.5799f, 21.58f)
                curveTo(12.6099f, 22.14f, 11.4099f, 22.14f, 10.4299f, 21.58f)
                lineTo(4.4899f, 18.15f)
                curveTo(3.5199f, 17.59f, 2.9199f, 16.55f, 2.9199f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.9199f, 7.46f, 3.5199f, 6.42f, 4.4899f, 5.85f)
                lineTo(6.3899f, 4.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9999f, 11.0001f)
                curveTo(13.2867f, 11.0001f, 14.3299f, 9.9569f, 14.3299f, 8.67f)
                curveTo(14.3299f, 7.3832f, 13.2867f, 6.3401f, 11.9999f, 6.3401f)
                curveTo(10.7131f, 6.3401f, 9.6699f, 7.3832f, 9.6699f, 8.67f)
                curveTo(9.6699f, 9.9569f, 10.7131f, 11.0001f, 11.9999f, 11.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.6601f)
                curveTo(16.0f, 14.8601f, 14.21f, 13.4001f, 12.0f, 13.4001f)
                curveTo(9.79f, 13.4001f, 8.0f, 14.8601f, 8.0f, 16.6601f)
            }
        }
        .build()
        return _useroctagon!!
    }

private var _useroctagon: ImageVector? = null
