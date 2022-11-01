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

public val LinearGroup.Alignleft: ImageVector
    get() {
        if (_alignleft != null) {
            return _alignleft!!
        }
        _alignleft = Builder(name = "Alignleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1f, 19.25f)
                horizontalLineTo(16.9f)
                curveTo(18.4f, 19.25f, 19.0f, 18.61f, 19.0f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(19.0f, 14.39f, 18.4f, 13.75f, 16.9f, 13.75f)
                horizontalLineTo(5.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1f, 5.25f)
                horizontalLineTo(11.9f)
                curveTo(13.4f, 5.25f, 14.0f, 5.89f, 14.0f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(14.0f, 10.11f, 13.4f, 10.75f, 11.9f, 10.75f)
                horizontalLineTo(5.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 1.99f)
                verticalLineTo(21.99f)
            }
        }
        .build()
        return _alignleft!!
    }

private var _alignleft: ImageVector? = null
