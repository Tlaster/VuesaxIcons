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

public val TwotoneGroup.Alignleft: ImageVector
    get() {
        if (_alignleft != null) {
            return _alignleft!!
        }
        _alignleft = Builder(name = "Alignleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0996f, 19.25f)
                horizontalLineTo(16.8996f)
                curveTo(18.3996f, 19.25f, 18.9996f, 18.61f, 18.9996f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(18.9996f, 14.39f, 18.3996f, 13.75f, 16.8996f, 13.75f)
                horizontalLineTo(5.0996f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0996f, 5.25f)
                horizontalLineTo(11.8996f)
                curveTo(13.3996f, 5.25f, 13.9996f, 5.89f, 13.9996f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(13.9996f, 10.11f, 13.3996f, 10.75f, 11.8996f, 10.75f)
                horizontalLineTo(5.0996f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 1.9902f)
                verticalLineTo(21.9902f)
            }
        }
        .build()
        return _alignleft!!
    }

private var _alignleft: ImageVector? = null
