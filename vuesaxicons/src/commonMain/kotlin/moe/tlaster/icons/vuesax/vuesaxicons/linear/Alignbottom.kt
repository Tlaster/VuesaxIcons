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

public val LinearGroup.Alignbottom: ImageVector
    get() {
        if (_alignbottom != null) {
            return _alignbottom!!
        }
        _alignbottom = Builder(name = "Alignbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.26f, 5.1001f)
                verticalLineTo(16.9001f)
                curveTo(19.26f, 18.4001f, 18.62f, 19.0001f, 17.03f, 19.0001f)
                horizontalLineTo(15.99f)
                curveTo(14.4f, 19.0001f, 13.76f, 18.4001f, 13.76f, 16.9001f)
                verticalLineTo(5.1001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.26f, 5.1001f)
                verticalLineTo(11.9001f)
                curveTo(5.26f, 13.4001f, 5.9f, 14.0001f, 7.49f, 14.0001f)
                horizontalLineTo(8.53f)
                curveTo(10.12f, 14.0001f, 10.76f, 13.4001f, 10.76f, 11.9001f)
                verticalLineTo(5.1001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _alignbottom!!
    }

private var _alignbottom: ImageVector? = null
