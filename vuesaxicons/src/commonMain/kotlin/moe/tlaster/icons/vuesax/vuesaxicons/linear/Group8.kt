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

public val LinearGroup.Group8: ImageVector
    get() {
        if (_group8 != null) {
            return _group8!!
        }
        _group8 = Builder(name = "Group8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.9f, 20.0f, 4.0f)
                verticalLineTo(8.32f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.3201f)
                verticalLineTo(11.8801f)
                curveTo(4.0f, 12.9601f, 4.58f, 13.9601f, 5.53f, 14.4901f)
                lineTo(8.49f, 16.16f)
                curveTo(9.12f, 16.51f, 9.51f, 17.1801f, 9.51f, 17.9001f)
                verticalLineTo(20.0001f)
                curveTo(9.51f, 21.1001f, 10.41f, 22.0001f, 11.51f, 22.0001f)
                horizontalLineTo(12.51f)
                curveTo(13.61f, 22.0001f, 14.51f, 21.1001f, 14.51f, 20.0001f)
                verticalLineTo(17.9001f)
                curveTo(14.51f, 17.1801f, 14.9f, 16.51f, 15.53f, 16.16f)
                lineTo(18.49f, 14.4901f)
                curveTo(19.43f, 13.9601f, 20.02f, 12.9601f, 20.02f, 11.8801f)
                verticalLineTo(8.3201f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _group8!!
    }

private var _group8: ImageVector? = null
