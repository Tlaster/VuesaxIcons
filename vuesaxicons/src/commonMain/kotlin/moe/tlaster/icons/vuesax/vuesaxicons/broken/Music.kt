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

public val BrokenGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2802f, 22.0f)
                curveTo(8.0033f, 22.0f, 9.4002f, 20.6031f, 9.4002f, 18.88f)
                curveTo(9.4002f, 17.1569f, 8.0033f, 15.76f, 6.2802f, 15.76f)
                curveTo(4.557f, 15.76f, 3.1602f, 17.1569f, 3.1602f, 18.88f)
                curveTo(3.1602f, 20.6031f, 4.557f, 22.0f, 6.2802f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.8404f, 7.9601f)
                verticalLineTo(4.6001f)
                curveTo(20.8404f, 2.0001f, 19.2104f, 1.6401f, 17.5604f, 2.0901f)
                lineTo(11.3204f, 3.7901f)
                curveTo(10.1804f, 4.1001f, 9.4004f, 5.0001f, 9.4004f, 6.3001f)
                verticalLineTo(8.4701f)
                verticalLineTo(9.9301f)
                verticalLineTo(18.8701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.8398f, 16.8f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7196f, 19.9199f)
                curveTo(19.4427f, 19.9199f, 20.8396f, 18.5231f, 20.8396f, 16.7999f)
                curveTo(20.8396f, 15.0768f, 19.4427f, 13.6799f, 17.7196f, 13.6799f)
                curveTo(15.9965f, 13.6799f, 14.5996f, 15.0768f, 14.5996f, 16.7999f)
                curveTo(14.5996f, 18.5231f, 15.9965f, 19.9199f, 17.7196f, 19.9199f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4004f, 9.5199f)
                lineTo(20.8404f, 6.3999f)
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
