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

public val TwotoneGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1694f, 10.0598f)
                horizontalLineTo(7.8293f)
                curveTo(6.6493f, 10.0598f, 6.2393f, 9.2698f, 6.9293f, 8.3098f)
                lineTo(11.0994f, 2.4698f)
                curveTo(11.5894f, 1.7698f, 12.4094f, 1.7698f, 12.8894f, 2.4698f)
                lineTo(17.0593f, 8.3098f)
                curveTo(17.7593f, 9.2698f, 17.3494f, 10.0598f, 16.1694f, 10.0598f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5894f, 18.0001f)
                horizontalLineTo(6.4194f)
                curveTo(4.8394f, 18.0001f, 4.2994f, 16.9501f, 5.2294f, 15.6701f)
                lineTo(9.2194f, 10.0601f)
                horizontalLineTo(14.7894f)
                lineTo(18.7794f, 15.6701f)
                curveTo(19.7094f, 16.9501f, 19.1694f, 18.0001f, 17.5894f, 18.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(18.0f)
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
