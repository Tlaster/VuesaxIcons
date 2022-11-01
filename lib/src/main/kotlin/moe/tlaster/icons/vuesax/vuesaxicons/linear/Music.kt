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

public val LinearGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.28f, 22.0f)
                curveTo(8.0032f, 22.0f, 9.4f, 20.6031f, 9.4f, 18.88f)
                curveTo(9.4f, 17.1569f, 8.0032f, 15.76f, 6.28f, 15.76f)
                curveTo(4.5569f, 15.76f, 3.16f, 17.1569f, 3.16f, 18.88f)
                curveTo(3.16f, 20.6031f, 4.5569f, 22.0f, 6.28f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.84f, 16.8001f)
                verticalLineTo(4.6001f)
                curveTo(20.84f, 2.0001f, 19.21f, 1.6401f, 17.56f, 2.0901f)
                lineTo(11.32f, 3.7901f)
                curveTo(10.18f, 4.1001f, 9.4f, 5.0001f, 9.4f, 6.3001f)
                verticalLineTo(8.4701f)
                verticalLineTo(9.9301f)
                verticalLineTo(18.8701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.72f, 19.9199f)
                curveTo(19.4431f, 19.9199f, 20.84f, 18.5231f, 20.84f, 16.7999f)
                curveTo(20.84f, 15.0768f, 19.4431f, 13.6799f, 17.72f, 13.6799f)
                curveTo(15.9968f, 13.6799f, 14.6f, 15.0768f, 14.6f, 16.7999f)
                curveTo(14.6f, 18.5231f, 15.9968f, 19.9199f, 17.72f, 19.9199f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4f, 9.5199f)
                lineTo(20.84f, 6.3999f)
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
