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

public val TwotoneGroup.Messageedit: ImageVector
    get() {
        if (_messageedit != null) {
            return _messageedit!!
        }
        _messageedit = Builder(name = "Messageedit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9088f, 7.8401f)
                lineTo(7.7188f, 13.0302f)
                curveTo(7.5188f, 13.2302f, 7.3288f, 13.6202f, 7.2888f, 13.9002f)
                lineTo(7.0088f, 15.8802f)
                curveTo(6.9088f, 16.6002f, 7.4088f, 17.1002f, 8.1288f, 17.0002f)
                lineTo(10.1088f, 16.7202f)
                curveTo(10.3888f, 16.6802f, 10.7788f, 16.4902f, 10.9788f, 16.2902f)
                lineTo(16.1688f, 11.1002f)
                curveTo(17.0588f, 10.2102f, 17.4888f, 9.1701f, 16.1688f, 7.8502f)
                curveTo(14.8488f, 6.5202f, 13.8088f, 6.9401f, 12.9088f, 7.8401f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.168f, 8.5801f)
                curveTo(12.608f, 10.1501f, 13.838f, 11.3901f, 15.418f, 11.8301f)
            }
        }
        .build()
        return _messageedit!!
    }

private var _messageedit: ImageVector? = null
