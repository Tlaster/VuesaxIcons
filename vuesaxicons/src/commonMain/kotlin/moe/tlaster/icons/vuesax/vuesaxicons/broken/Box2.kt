package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Box2: ImageVector
    get() {
        if (_box2 != null) {
            return _box2!!
        }
        _box2 = Builder(name = "Box2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6694f, 18.67f)
                lineTo(20.8894f, 17.56f)
                verticalLineTo(14.78f)
                moveTo(14.2194f, 9.78f)
                lineTo(11.9994f, 10.89f)
                lineTo(14.2194f, 9.78f)
                close()
                moveTo(11.9994f, 10.89f)
                lineTo(9.7794f, 9.78f)
                lineTo(11.9994f, 10.89f)
                close()
                moveTo(11.9994f, 10.89f)
                verticalLineTo(13.67f)
                verticalLineTo(10.89f)
                close()
                moveTo(20.8894f, 6.44f)
                lineTo(18.6694f, 7.55f)
                lineTo(20.8894f, 6.44f)
                close()
                moveTo(20.8894f, 6.44f)
                lineTo(18.6694f, 5.33f)
                lineTo(20.8894f, 6.44f)
                close()
                moveTo(20.8894f, 6.44f)
                verticalLineTo(9.22f)
                verticalLineTo(6.44f)
                close()
                moveTo(14.2194f, 3.11f)
                lineTo(11.9994f, 2.0f)
                lineTo(9.7794f, 3.11f)
                horizontalLineTo(14.2194f)
                close()
                moveTo(3.1094f, 6.44f)
                lineTo(5.3294f, 5.33f)
                lineTo(3.1094f, 6.44f)
                close()
                moveTo(3.1094f, 6.44f)
                lineTo(5.3294f, 7.55f)
                lineTo(3.1094f, 6.44f)
                close()
                moveTo(3.1094f, 6.44f)
                verticalLineTo(9.22f)
                verticalLineTo(6.44f)
                close()
                moveTo(11.9994f, 22.0f)
                lineTo(9.7794f, 20.89f)
                lineTo(11.9994f, 22.0f)
                close()
                moveTo(11.9994f, 22.0f)
                lineTo(14.2194f, 20.89f)
                lineTo(11.9994f, 22.0f)
                close()
                moveTo(11.9994f, 22.0f)
                verticalLineTo(19.22f)
                verticalLineTo(22.0f)
                close()
                moveTo(5.3294f, 18.67f)
                lineTo(3.1094f, 17.56f)
                verticalLineTo(14.78f)
                lineTo(5.3294f, 18.67f)
                close()
            }
        }
        .build()
        return _box2!!
    }

private var _box2: ImageVector? = null
