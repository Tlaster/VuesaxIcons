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

public val LinearGroup.Refreshsquare2: ImageVector
    get() {
        if (_refreshsquare2 != null) {
            return _refreshsquare2!!
        }
        _refreshsquare2 = Builder(name = "Refreshsquare2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 15.04f, 15.04f, 17.5f, 12.0f, 17.5f)
                curveTo(8.96f, 17.5f, 7.11f, 14.44f, 7.11f, 14.44f)
                moveTo(7.11f, 14.44f)
                horizontalLineTo(9.59f)
                moveTo(7.11f, 14.44f)
                verticalLineTo(17.19f)
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 8.96f, 8.94f, 6.5f, 12.0f, 6.5f)
                curveTo(15.67f, 6.5f, 17.5f, 9.56f, 17.5f, 9.56f)
                moveTo(17.5f, 9.56f)
                verticalLineTo(6.81f)
                moveTo(17.5f, 9.56f)
                horizontalLineTo(15.06f)
            }
        }
        .build()
        return _refreshsquare2!!
    }

private var _refreshsquare2: ImageVector? = null
