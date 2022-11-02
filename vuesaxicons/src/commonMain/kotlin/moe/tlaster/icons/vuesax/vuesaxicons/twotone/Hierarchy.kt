package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Hierarchy: ImageVector
    get() {
        if (_hierarchy != null) {
            return _hierarchy!!
        }
        _hierarchy = Builder(name = "Hierarchy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 8.5f)
                curveTo(7.0449f, 8.5f, 8.5f, 7.0449f, 8.5f, 5.25f)
                curveTo(8.5f, 3.4551f, 7.0449f, 2.0f, 5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                curveTo(2.0f, 7.0449f, 3.4551f, 8.5f, 5.25f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(6.6568f, 22.0f, 8.0f, 20.6569f, 8.0f, 19.0f)
                curveTo(8.0f, 17.3431f, 6.6568f, 16.0f, 5.0f, 16.0f)
                curveTo(3.3431f, 16.0f, 2.0f, 17.3431f, 2.0f, 19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                curveTo(22.0f, 17.3431f, 20.6569f, 16.0f, 19.0f, 16.0f)
                curveTo(17.3431f, 16.0f, 16.0f, 17.3431f, 16.0f, 19.0f)
                curveTo(16.0f, 20.6569f, 17.3431f, 22.0f, 19.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.0f)
                verticalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1289f, 9.0f)
                curveTo(5.5789f, 10.75f, 7.1789f, 12.05f, 9.0689f, 12.04f)
                lineTo(12.4989f, 12.03f)
                curveTo(15.1189f, 12.02f, 17.3489f, 13.7f, 18.1689f, 16.04f)
            }
        }
        .build()
        return _hierarchy!!
    }

private var _hierarchy: ImageVector? = null
